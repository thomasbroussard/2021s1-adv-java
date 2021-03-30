package fr.epita.neo4j.test;

import org.junit.Test;

import fr.epita.users.datamodel.User;
import fr.epita.users.services.data.Neo4jUserDAO;

public class Neo4JConnectionsTest {

	
	static {
		System.setProperty("conf.location", "src/test/resources/application.properties");
	}
	
	
	@Test
	public void testFirstConnection() {
		
		
		Neo4jUserDAO dao = new Neo4jUserDAO();
		dao.searchUsers(new User());
	}

	
	
	

}
