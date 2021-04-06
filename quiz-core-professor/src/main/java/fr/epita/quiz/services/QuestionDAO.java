package fr.epita.quiz.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
	public List<Question> searchQuestion(Question questionQBE) throws SQLException {
		Connection connection = this.datasource.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM questions");
		ResultSet results = preparedStatement.executeQuery();
		List<Question> list = new ArrayList<>();
		while (results.next()) {
			String question = results.getString("question");
			Integer id = results.getInt("id");
			Integer difficulty = results.getInt("difficulty");
			
			Question questionInstance = new Question("question");
			questionInstance.setDifficulty(difficulty);
			questionInstance.setId(id);
			list.add(questionInstance);
		}
		return list;
		
	}

}
