package Encapsulation;

//Write a Java Program for concept of Encapsulation

public class EncapsulationConcept {
    private int amount=0;
    public int getAmount()
    {    return amount;
    }
    public void setAmount(int amt)
    {    amount=amt;
    }


    public static void main(String[ ] args)
    {    int amt=0;
        EncapsulationConcept obj=new EncapsulationConcept();
        obj.setAmount(200);
        amt=obj.getAmount();
        System.out.println("Your current amount is :"+amt);
    }
}

