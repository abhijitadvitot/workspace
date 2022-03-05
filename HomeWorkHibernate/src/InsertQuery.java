import org.hibernate.Session;
import org.hibernate.query.Query;

public class InsertQuery {

    public static void insertQuery(Session session){


        Query query = session.createQuery((  101'Abhi''8446460077','8000','associte'),Employee));
        System.out.println("Inserting a new record");
        query.executeUpdate();
        session.getTransaction().commit();
    }

}
