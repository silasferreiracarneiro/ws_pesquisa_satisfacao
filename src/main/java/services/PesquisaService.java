package services;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import domain.SendSatisfactionSurvey;
import repository.PesquisaRepository;

@Service
public class PesquisaService {

	MongoClientURI uri = new MongoClientURI(
		    "mongodb://admin:<5NW9Dic$VxDTZq$>@cluster0-shard-00-00-vbcv2.mongodb.net:27017,cluster0-shard-00-01-vbcv2.mongodb.net:27017,cluster0-shard-00-02-vbcv2.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true&w=majority");
	MongoClient mongoClient = new MongoClient(uri);
	MongoDatabase database = mongoClient.getDatabase("pesquisa");
	MongoCollection<Document> collection = database.getCollection("pesquisa");
	
	@Autowired
	private PesquisaRepository repository;
	
	public SendSatisfactionSurvey buscar(int pedidoId) {
		BasicDBObject whereQuery = new BasicDBObject();
	    whereQuery.put("pedidoId", pedidoId);
		return (SendSatisfactionSurvey) collection.find(whereQuery, SendSatisfactionSurvey.class);
	}
	
	public void save(SendSatisfactionSurvey pesquisa) {
		Document document = new Document();
		document.append("pesquisaId", pesquisa.getPesquisaId());
		document.append("pedidoId", pesquisa.getPedidoId());
		document.append("cutomerId", pesquisa.getCutomerId());
		document.append("sessionId", pesquisa.getSessionId());
		document.append("questions", pesquisa.getQuestions());
		collection.insertOne(document);
	}
}
