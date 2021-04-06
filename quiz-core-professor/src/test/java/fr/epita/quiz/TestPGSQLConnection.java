package fr.epita.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.quiz.datamodel.Question;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestPGSQLConnection {

	@Inject
	DataSource ds;
	
	
	@Test
	public void testConnection() throws SQLException {
		Connection connection = ds.getConnection();
		String schema = connection.getSchema();
		Assert.assertNotNull(schema);
		connection.close();
	}
	
	@Test
	public void testConnectionWithDatasource() throws SQLException {
		Connection connection = ds.getConnection();
		String schema = connection.getSchema();
		Assert.assertNotNull(schema);
		connection.close();
		
		
	
	}
	
	
}
