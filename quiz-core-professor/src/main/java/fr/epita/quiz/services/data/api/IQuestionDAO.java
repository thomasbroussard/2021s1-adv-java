package fr.epita.quiz.services.data.api;

import java.util.List;

import fr.epita.quiz.datamodel.Question;

public interface IQuestionDAO {
	
	public List<Question> search(Question questionQBE) throws DataAccessException;
	
	public void update(Question question) throws DataAccessException;
	
	public void delete(Question question) throws DataAccessException;
	
	public void create(Question question)throws DataAccessException;

}
