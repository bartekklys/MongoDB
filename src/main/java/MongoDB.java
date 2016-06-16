import com.mongodb.*;

public class MongoDB {

    public static void main(String[] args) {

        Mongo mongo = new Mongo("localhost", 27017);
        DB db = mongo.getDB("testdb");
        DBCollection table = db.getCollection("testdb");

        find(table);


    }

    private static void find (DBCollection channelDBCollection){
        DBCursor dbCursor = channelDBCollection.find();
        while (dbCursor.hasNext()) System.out.println(dbCursor.next());
    }
}
