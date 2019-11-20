package resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import domain.SendSatisfactionSurvey;
import repository.PesquisaRepository;

@RestController
@RequestMapping(value="/pesquisa")
public class EmailResource {

	@Autowired
	private PesquisaRepository repository;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> send(@PathVariable String id) {
		Optional<SendSatisfactionSurvey> pesquisa = repository.findById(id);
		if(pesquisa != null)
			return ResponseEntity.ok(pesquisa);
		else
			return ResponseEntity.ok("Nada encontrado");
	}
	
	@RequestMapping(value="/savePesquisa", method=RequestMethod.POST)
	public ResponseEntity<?> send(@RequestBody SendSatisfactionSurvey pesquisa) {
		repository.save(pesquisa);
		return ResponseEntity.ok(true);
	}
}
