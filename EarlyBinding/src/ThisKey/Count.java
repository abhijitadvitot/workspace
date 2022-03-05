package ThisKey;

public class Count {
    int i = 0;

    Count increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }
}