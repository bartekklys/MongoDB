package DB.Main;

import DB.DBManager.RetrieveDocuments;

public class Start {

    public static void main(String[] args) {

        //USUNAC WSZYSTKIE DUPY!!

        //InsertCollection i = new InsertCollection();
        //
        //i.insert();

        //GetCollection gc = new GetCollection();
        //gc.getCollection();

        RetrieveDocuments rd = new RetrieveDocuments();
        rd.retrieve();
    }
}
