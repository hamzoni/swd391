package model;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import common.AppConfig;

public class Model {
	
	public MongoClient mongoClient;
	public DB db;
	
	DBCollection collection;
	
	public Model(String tableName) {
		
		this.mongoClient = new MongoClient(AppConfig.host, AppConfig.port);
		this.db = this.mongoClient.getDB(AppConfig.dbName);
		this.collection = this.db.getCollection(tableName);
		
	}
    
}
