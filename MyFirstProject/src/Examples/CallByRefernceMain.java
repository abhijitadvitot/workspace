package Examples;

public class CallByRefernceMain {
    public static void main(String args [ ]) {
    CallByReference t=new CallByReference(4,5);
    System.out.println("Before calling a="+t.a+"b="+t.b);
    t.meth(t);
    System.out.println("After calling a="+t.a+"b="+t.b);
}


}
