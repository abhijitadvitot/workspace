public class Car  extends Vehicale{
    public void start() {   // early binding
        // TODO Auto-generated method stub
        System.out.println("car has been started");
    }
    public static void stop() { // late binding
        // TODO Auto-generated method stub
        System.out.println("Car has been stopped");
    }

}
