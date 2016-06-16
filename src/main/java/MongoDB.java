import com.mongodb.*;
import com.mongodb.util.JSON;

public class MongoDB {

    public static void main(String[] args) {

        Mongo mongo = new Mongo("localhost", 27017);
        DB db = mongo.getDB("testdb");
        DBCollection table = db.getCollection("testdb");
        String json = "{\"name\" : \"Bartus Klys\"}";

        find(table);
        insertJSON(json, table);
        find(table);

    }

    private static void find (DBCollection channelDBCollection){
        DBCursor dbCursor = channelDBCollection.find();
        while (dbCursor.hasNext()) System.out.println(dbCursor.next());
    }

    private static void insertJSON(String command, DBCollection dbCollection){
        dbCollection.insert((DBObject) JSON.parse(command));
    }
}
