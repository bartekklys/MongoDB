package DB.DBManager;

import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;

public class InsertCollection {

    public void insert() {

        try{

            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            DB db = mongoClient.getDB( "testdb" );
            DBCollection coll = db.getCollection("mojaKolekcjaTest");

            //BasicDBObject doc = new BasicDBObject("title", "MongoDB").
            //        append("description", "database");

            //coll.insert(doc);
        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
}
