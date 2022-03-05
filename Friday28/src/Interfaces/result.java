package Interfaces;

public class result  extends percentage implements sports    //hybrid & multiple inheritance
{
    public void printdata()
{    super.printdata();
    sum=sum+smarks;
     avg=sum/3;
    System.out.println("Subject sum and avg with sportsm\n"+sum+"\n"+avg);
}
}

