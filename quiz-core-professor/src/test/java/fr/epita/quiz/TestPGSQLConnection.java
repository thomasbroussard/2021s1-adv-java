package fr.epita.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

public class TestPGSQLConnection {

	
	@Test
	public void testConnection() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
		String schema = connection.getSchema();
		Assert.assertNotNull(schema);
	}
	
	
}
