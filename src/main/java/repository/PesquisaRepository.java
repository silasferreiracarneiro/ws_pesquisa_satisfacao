package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import domain.SendSatisfactionSurvey;

@Repository
public interface PesquisaRepository extends MongoRepository<SendSatisfactionSurvey, String> {

}
