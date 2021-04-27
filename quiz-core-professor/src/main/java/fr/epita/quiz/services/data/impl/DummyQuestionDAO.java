package fr.epita.quiz.services.data.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.services.data.api.DataAccessException;
import fr.epita.quiz.services.data.api.IQuestionDAO;

public class DummyQuestionDAO implements IQuestionDAO {

	List<Question> dummyQuestionDataSource = new ArrayList<>();

	@Override
	public List<Question> search(Question questionQBE) throws DataAccessException {
		return dummyQuestionDataSource.stream()
				.filter(q -> q.getSubject().equals(questionQBE.getSubject()))
				.collect(Collectors.toList());
	}

	@Override
	public void update(Question question) throws DataAccessException {

	}

	@Override
	public void delete(Question question) throws DataAccessException {

	}

	@Override
	public void create(Question question) throws DataAccessException {
		dummyQuestionDataSource.add(question);
	}

}
