package fr.epita.quiz.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;


import fr.epita.quiz.datamodel.Question;

public class QuestionDAO {
	
	@Inject
	DataSource datasource;

	public void createQuestion(Question question) throws SQLException {
		Connection connection = this.datasource.getConnection();
			
		
	}
	public void deleteQuestion(Question question) throws SQLException {
		Connection connection = this.datasource.getConnection();
		
		
	}
	public void updateQuestion(Question question) throws SQLException {
		Connection connection = this.datasource.getConnection();
		
		
	}
	public List<Question> searchQuestion(Question question) throws SQLException {
		Connection connection = this.datasource.getConnection();
		
		return null;
		
	}

}
