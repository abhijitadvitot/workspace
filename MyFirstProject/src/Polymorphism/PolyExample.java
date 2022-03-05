package Polymorphism;

public class PolyExample{
    public static void main(String[ ] args){
        A obj;
    obj=new A(); //we created the object  of Class A
    obj.fun1(2); //call the method
    obj=new B();//we created the object  of Class B
    obj.fun1(5);//call the method
    }

}
