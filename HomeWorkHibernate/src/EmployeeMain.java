import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeMain {





    public static void main(String[] args) {


        SessionFactory sessionFactory=HibernateUtility.getSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
          Employee employee=new Employee();
//          employee.setEmpId(101);
//          employee.setEmpName("Abhijit Advitot");
//          employee.setMobileNo("8446460077");
//          employee.setEmpDesignation("Associate Engineer");
//        employee.setEmpSalary("30000");
       InsertQuery.insertQuery(session);



        Query query= session.createQuery(" from Employee");
        List<Employee> collection = query.getResultList();
        System.out.println("Retrieving and displaying details of all the users");
        for(Employee object : collection)
        {
            System.out.println("Id : " + object.getEmpId());
            System.out.println(" Name : " + object.getEmpName());
            System.out.println("mobileno : " + object.getMobileNo());
            System.out.println("Salary : " + object.getEmpSalary());
            System.out.println("Designation : " + object.getEmpDesignation());

            System.out.println();
        }

//Inserting data into employee table.

////Retrieve and displaying all the updated records of UserInfo
//        session = sf.openSession();
//        session.beginTransaction();
//        Query query2 = session.createQuery("from UserInfo");
//        List<UserInfo> collection2 = query2.getResultList();
//        System.out.println("Retrieving and displaying the updated details of users");
//        for(UserInfo object : collection2)
//        {
//            System.out.println("Id : " + object.getId());
//            System.out.println("First Name : " + object.getFirstName());
//            System.out.println("Last Name : " + object.getLastName());
//            System.out.println();

transaction.commit();
  session.close();
  sessionFactory.close();
    }




}
