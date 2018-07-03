/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import common.AppConfig;
import common.LogSWD;
import model.Users;

/**
 *
 * @author Duc
 */
public class GetDataFromMongoDBExample {
    
    public static void main(String[] args) {
        try {
            // Connect to db
            MongoClient mongoClient = new MongoClient(AppConfig.host, AppConfig.port);
            DB db = mongoClient.getDB(AppConfig.dbName);
            LogSWD.d("Connected to DB");

            // Get data, now Users have username, password and name (Users table called collection in Mongodb )
            DBCollection userCollection = db.getCollection("Users");

            // Example with 1 document (document is record in sql)
            DBObject dbo = userCollection.findOne();

            // Log all of it
            if (dbo.get("username") == null || dbo.get("password") == null) {
                LogSWD.e("Collection have not been init");
            } else {
                LogSWD.i(dbo.get("username") + " " + dbo.get("password"));
                Users u = new Users(dbo);
                if (u != null) {
                    LogSWD.i(u.toString());
                }
            }
        } catch (Exception e) {
            LogSWD.e(e.getLocalizedMessage());
        }
    }
}
