//Java Program to explains the concept of copy constructor
package Constructor;

public class copycos {
    public static void main(String args[ ]) {
        Person a=new Person(10);
        Person b=new Person(15);
        Person c = a;
        System.out.println(a.age+" "+b.age+" "+c.age);
        a.age = 23;
        System.out.println(a.age+ "  "+b.age+" "+c.age);
    }
}

