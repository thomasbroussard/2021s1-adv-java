package fr.epita.neo4j.test;

import org.junit.Test;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.Value;

public class Neo4JConnectionsTest {

	@Test
	public void testFirstConnection() {
		Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "neo4j"));
		Session session = driver.session();
		Transaction tx = session.beginTransaction();
		
		Result result = tx.run("MATCH (n) RETURN n");
		while(result.hasNext()) {
			Record node = result.next();
			Value value = node.get("n");
			Value name = value.get("name");
			System.out.println(name);
		}
		tx.commit();
		session.close();
	}
	
	

}
