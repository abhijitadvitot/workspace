import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HibernateMain {
    public static void main(String[] args) {
        /// Session session = HibernateUtil.getSessionFactory().openSession();
        SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Person person=new Person();
        person.setName("lucky Sury");
        person.setId(11);
        person.setAddress("pune");
        person.setPhone("9595918103");
        session.save(person);
        Laptop laptop=new Laptop();
        laptop.setHdd("100GB");
        laptop.setCpu("i7");
        laptop.setRam("apple");
        laptop.setMfg(new Date());
        session.save(laptop);
Project project= new Project();
      project.setProjectID(10l);
      project.setProjectName("Mac");
      project.setContactPerson("prshant Moer");
      project.setVersion(2);
        session.save(project);


//        ContactDetails contactDetails=new ContactDetails();
//        contactDetails.setCid(84464646l);
//        contactDetails.setEmail("abhijit.adviti@gmail.com");
//        contactDetails.setVersion(20);
//        contactDetails.setPhone("992221305");
//        session.save(contactDetails);

         List<ContactDetails> contactDetails=new ArrayList<>();
         ContactDetails contactDetails1 =new ContactDetails("7410740595","putti@gmail.com",ContactType.BUSINESS);
         contactDetails.add(contactDetails1);
        ContactDetails contactDetails2 =new ContactDetails("9028427611","anna@gmail.com",ContactType.HOME);
        contactDetails.add(contactDetails2);
        ContactDetails contactDetails3 =new ContactDetails("9999999","akka@gmail.com",ContactType.OFFICE);

        contactDetails.add(contactDetails3);
              session.save(contactDetails1);
              session.save(contactDetails2);
              session.save(contactDetails3);
Employee employee=new Employee();
employee.setEmployeeID(51l);
employee.setDepartmentName("IT");
employee.setLaptop(laptop);

employee.setContactDetails(contactDetails);

session.save(contactDetails1);
session.save(laptop);
session.save(employee);


 transaction.commit();


        session.close();           // Optional
        sessionFactory.close();   // Optional
    }}

