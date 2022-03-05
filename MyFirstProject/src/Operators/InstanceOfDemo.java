//write a java program Type Comparison Operator

package Operators;

public class InstanceOfDemo {

        public static void main(String args[ ])
    {    X x = new X();
        Y y = new Y();
        Z z = new Z();
        if(x instanceof X)
            System.out.println("x is instance of X");
        X obj;
        obj = z; // X reference to Z
        if(obj instanceof Z)
            System.out.println("obj is instance of Z");
    }
    }

