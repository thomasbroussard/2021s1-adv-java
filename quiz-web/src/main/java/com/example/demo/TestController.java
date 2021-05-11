package com.example.demo;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.services.data.api.DataAccessException;
import fr.epita.quiz.services.data.api.IQuestionDAO;

@RestController
public class TestController {

	private static final String BASE_PATH = "/questions";
	@Inject
	IQuestionDAO dao;

	@GetMapping(path = BASE_PATH + "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Question>> find(@PathVariable("id") String id) throws DataAccessException {
		Question criterion = new Question("");
		criterion.setId(Integer.valueOf(id));
		List<Question> search = dao.search(criterion);
		return ResponseEntity.ok(search);

	}

	@PostMapping(path = BASE_PATH, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Question> create(Question question) {
		try {
			dao.create(question);
		} catch (Exception e) {
			return ResponseEntity.status(500).body(question);
		}
		return ResponseEntity.created(URI.create(BASE_PATH + "/" + question.getId())).build();

	}

}
