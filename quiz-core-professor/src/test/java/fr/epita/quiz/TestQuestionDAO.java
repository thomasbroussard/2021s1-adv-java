package fr.epita.quiz;

import java.sql.SQLException;

import javax.inject.Inject;

import org.junit.Test;

import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.services.QuestionDAO;

public class TestQuestionDAO {
	
	 @Inject
	 QuestionDAO dao;
	 
	 
	 @Test
	 public void testSearch() throws SQLException {
		 
		 dao.searchQuestion(new Question("Java"));
		 
	 }

}
