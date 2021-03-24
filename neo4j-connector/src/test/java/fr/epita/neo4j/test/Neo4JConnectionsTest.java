package fr.epita.neo4j.test;

import java.security.Policy.Parameters;

import org.junit.Test;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.Value;
import org.neo4j.driver.Values;

public class Neo4JConnectionsTest {

	@Test
	public void testFirstConnection() {
		searchUser();
	}

	
	
	

}
