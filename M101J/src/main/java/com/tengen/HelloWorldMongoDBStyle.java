package com.tengen;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

public class HelloWorldMongoDBStyle {
	public static void main(String[] args) throws UnknownHostException {
		// logical connectionj to a mongo cluster
		MongoClient client = new MongoClient(new ServerAddress("localhost", 27017));
		
		DB database = client.getDB("m101");
		DBCollection collection = database.getCollection("funnynumbers");
		
		DBObject document = collection.findOne();
		System.out.println(document);
	}
}
