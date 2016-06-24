package DB.DBManager;

import com.mongodb.MongoClient;
import com.mongodb.DB;

public class Connect {

    public static void connect() {

        try{
            // To connect to mongodb server
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            // Now connect to your databases
            DB db = mongoClient.getDB( "testdb" );

        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
}