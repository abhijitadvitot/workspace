import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class FetchingTheRecords {
    public static void main(String[] args) {


        SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
        Session session = sessionFactory.openSession();
//    Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Laptop");
        ((org.hibernate.query.Query) query).setString("name", "Tarkesh");
        List lst = ((org.hibernate.query.Query) query).list();
        for (Object obj : lst) {
            System.out.println(obj);
        }
    }
}