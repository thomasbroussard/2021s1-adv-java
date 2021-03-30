package fr.epita.users.services.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.Value;
import org.neo4j.driver.Values;

import fr.epita.users.datamodel.User;
import fr.epita.users.services.Configuration;

public class Neo4jUserDAO {


	public List<User> searchUsers(User user) {
		Configuration conf = Configuration.getInstance();
		Driver driver = GraphDatabase.driver(conf.getUrl(), AuthTokens.basic(conf.getDatabaseUserName(), conf.getDatabasePassword()));
		Session session = driver.session();
		Transaction tx = session.beginTransaction();

		List<User> resultList = new ArrayList<User>();
		Result result = tx.run("MATCH (n:User{name:$someone}) RETURN n", Values.parameters("someone", user.getName()));
		while (result.hasNext()) {
			Record record = result.next();
			Value value = record.get("n");
			Map<String, Object> valuesMap = value.asMap();
			User currentUser = new User();

			currentUser.setName(String.valueOf(valuesMap.get("name")));
			currentUser.setSurname(String.valueOf(valuesMap.get("surname")));
			currentUser.setCity(String.valueOf(valuesMap.get("city")));
			currentUser.setAge(Integer.parseInt(String.valueOf(valuesMap.get("age"))));
			resultList.add(currentUser);

		}
		session.close();
		return resultList;
	}

}
