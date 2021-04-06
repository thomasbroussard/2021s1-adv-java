package fr.epita.databases.mongo;

import java.util.Arrays;

import org.bson.Document;
import org.junit.Test;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class TestMongoDBConnector {

	@Test
	public void testConnection() {

		MongoClient mongoClient = new MongoClient(
		    new MongoClientURI(
		       // "mongodb://localhost:27017/?readPreference=primary&appname=MongoDB%20Compass&ssl=false"
		    "mongodb://localhost:27017/"
		    		)
		);
		MongoDatabase database = mongoClient.getDatabase("sampleDB");
		MongoCollection<Document> collection = database.getCollection("cities");

		

		AggregateIterable<Document> result = collection.aggregate(Arrays.asList(
			new Document("$match", 
					new Document("population", 
							new Document("$gt", 500000L))), 
			new Document("$group", 
					new Document("_id", "$admin_name")
						.append("count", new Document("$sum", 1L)))));
		
		Document document = result.first();
		System.out.println(document.getLong("count"));
	}
	
}
