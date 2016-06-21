package DB;

import com.mongodb.*;
import com.mongodb.util.JSON;

public class MongoDB {

    public static void main(String[] args) {

        Mongo mongo = new Mongo("localhost", 27017);
        DB db = mongo.getDB("testdb");
        DBCollection document = db.getCollection("employees"); // name of MongoDB document
        String json = "{\"name\" : \"Bartek Klys\"}"; //json we want to insert to document

        insertJSON(json, document);
        //document.drop();
        find(document);
    }

    /**
     * This method prints all records from database.
     *
     * @param channelDBCollection - name of MongoDB document.
     */
    private static void find (DBCollection channelDBCollection){
        DBCursor dbCursor = channelDBCollection.find();
        while (dbCursor.hasNext()) System.out.println(dbCursor.next());
    }

    /**
     * This method inserts json into a document in database.
     *
     * @param json - this is JSON we want to insert into a document.
     * @param document - document in out database.
     */
    private static void insertJSON(String json, DBCollection document){
        document.insert((DBObject) JSON.parse(json));
    }
}