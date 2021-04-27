package fr.epita.quiz;

import javax.inject.Inject;

import org.junit.Test;

import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.services.data.api.DataAccessException;
import fr.epita.quiz.services.data.impl.QuestionDAO;

public class TestQuestionDAO {
	
	 @Inject
	 QuestionDAO dao;
	 
	 
	 @Test
	 public void testSearch() throws DataAccessException {
		 
		 dao.search(new Question("Java"));
		 
	 }

}
