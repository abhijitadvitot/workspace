//Java program demo for Call by reference
package Examples;

public class CallByReference {
    int a, b;

    CallByReference(int i, int j) {
        a = i;
        b = j;
    }

    void meth(CallByReference of) {
        of.a = a * 2;
        of.b = b / 2;
    }

}
