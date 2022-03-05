import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.internal.SessionFactoryImpl;

public class HibernateMain {
    public static void main(String[] args) {

        SessionFactory sessionFactory=HibernateUtility.getSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        Person person =new Person();
//        person.setId(1);
//        person.setPhone("8446460077");
//        person.setAddress("Solapur");
//        person.setName("Abhijit Advitot");

        person.setName("Ankita");
        person.setAddress("pune");


        Laptop laptop=new Laptop();
        laptop.setCpu("i7");
        laptop.setHdd("500");
        laptop.setRam("8Gb");
  person.setLaptop(laptop);
        session.save(person);
          session.save(laptop);
transaction.commit();
session.close();
sessionFactory.close();

    }
}
