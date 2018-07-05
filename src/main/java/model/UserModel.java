package model;


import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import entity.User;

public class UserModel extends Model {
	
	public UserModel() {
		super("Users");
	}
	
	public User login(String username, String password) {
		
		BasicDBObject query = new BasicDBObject();
		query.put("username", username);
		query.put("password", password);
		
		DBCursor dbc = collection.find(query);
	
		if (dbc.size() == 0) return null;
		
		DBObject dbo = dbc.one();
		
		return new User(dbo);
		
	}
}
