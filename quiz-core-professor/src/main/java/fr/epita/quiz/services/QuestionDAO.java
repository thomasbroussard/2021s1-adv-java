package fr.epita.quiz.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import fr.epita.quiz.datamodel.Question;

public class QuestionDAO {
	

	DataSource datasource;

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public void createQuestion(Question question) throws SQLException {
		Connection connection = this.datasource.getConnection();
		
	}

}
