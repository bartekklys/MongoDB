import com.mongodb.*;

public class MongoDB {

    public static void main(String[] args) {

        Mongo mongo = new Mongo("localhost", 27017);
        DB db = mongo.getDB("testdb");
        DBCollection table = db.getCollection("testcoll");

        table.drop();

    }
}