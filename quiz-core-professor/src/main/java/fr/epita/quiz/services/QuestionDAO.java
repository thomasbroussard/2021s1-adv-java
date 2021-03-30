package fr.epita.quiz.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;

import fr.epita.quiz.datamodel.Question;

public class QuestionDAO {
	
	
//	@Inject
//	@Named("db.pg.url")
	String url;
//	
//	@Inject
//	@Named("db.pg.username")
	String username;
	
//	@Inject
//	@Named("db.pg.password")
	String pwd;
	
	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public void createQuestion(Question question) throws SQLException {
		Connection connection = DriverManager.getConnection(url,username,pwd);
		
	}

}
