package DB;

import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;

public class GetCollection {

    public void getCollection() {

        try {
            // To connect to mongodb server
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            // Now connect to your databases
            DB db = mongoClient.getDB("testdb");

            DBCollection coll = db.getCollection("oceny");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}