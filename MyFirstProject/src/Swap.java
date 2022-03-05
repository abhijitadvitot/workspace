//  Swapping two numbers with third  varivable and without using third


public class Swap {
      int x=10;
      int y=20;

      public  void WOT(){
            x=x+y;
            y=x-y;
            x=x-y;
          System.out.println(""+x+ " "+y);
      }
public void thirdVar(){

          int temp=x;
          x=y;
          y=temp;
    System.out.println(""+x+ " "+y);

}

    public static void main(String[] args) {
        Swap s= new Swap();
        s.WOT();
        s.thirdVar();




    }
}
