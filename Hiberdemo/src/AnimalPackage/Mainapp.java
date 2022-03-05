package AnimalPackage;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.security.auth.login.Configuration;

public class Mainapp {

    private static SessionFactory factory;
    public static void main(String[] args) {
// TODO Auto-generated method stub

        try {
//            factory = new Configuration().configure("AnimalPackage.hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        Session session = factory.openSession();
        Transaction tx = null;
        Long PersonID = null;



        Animal animal=new Animal();
        animal.setFamily("Felish");
        Lion loin =new Lion(animal);



        try {
            tx = session.beginTransaction();
            loin.setAnimal(animal);
            loin.setBreed("Lio");
            session.save(loin);



            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


}

