package twentynine;

import java.util.Scanner;

abstract class Bank{
    abstract float getBalance();
    abstract void withdrawal(int amount);
}
class Hdfcbank extends Bank{
    float balance=0;
    public void setBalance(float amount){
        this.balance+=amount;
        System.out.println("Amount deposited successfully"+balance);
    }
    float getBalance(){
        return this.balance;
    }
    void withdrawal(int amount){
        if(amount<=0){
            System.out.println("enter valid amount ");
            
        }
        if(this.balance>=amount){
            this.balance-=amount;
            System.out.println(amount+" with draw successfully ");
        }else{
            System.out.println("insufficient funds");
        }
    }
}
class IndianBank extends Bank{
    float balance;
    public void setBalance(float amount){
        this.balance=amount;
    }
    float getBalance(){
        return this.balance;
    }
    void withdrawal(int amount){
        if(amount<=0){
            System.out.println("enter valid amount ");
            
        }
        if(this.balance>=amount){
            this.balance-=amount;
            System.out.println(amount+" with draw successfully ");
        }
    }

}
class RepublicBank extends Bank {
float balance;
    public void setBalance(float amount){
        this.balance=amount;
    }
    float getBalance(){
        return this.balance;
    }void withdrawal(int amount){
        if(amount<=0){
            System.out.println("enter valid amount ");
            
        }
        if(this.balance>=amount){
            this.balance-=amount;
            System.out.println(amount+" with draw successfully ");
        }
    }

    
}
public class Differentbanks  {

    public static void main(String[] args) {
        Hdfcbank h=new Hdfcbank();
    IndianBank i=new IndianBank();
    RepublicBank r=new RepublicBank();
        Scanner sc=new Scanner(System.in);
    System.out.println("welcome to different types of banks ");
    boolean is=true;
    while(is){
    System.out.println("1) HdfC bank 2) Republic Bank 3) Indian Bank 4)exit 5)Balance in all Banks ");
    int val=sc.nextInt();
    
    switch (val) {
        
        default:
        System.out.println("Enter the valid choice ");
            break;
        case 1:
        while(true){
            System.out.println("Welcome to Hdfc Bank ");
            System.out.println("1)deposit 2) withdrawal 3)getbalance 4)exit ");
            int choice=sc.nextInt();
            
            switch (choice) {
                case 1:
                System.out.print("enter the money to be deposited ");
                    float money=sc.nextFloat();
                    h.setBalance(money);
                    break;
                case 2:
                System.out.print("enter amount to be withdrawn ");
                int moneyn=sc.nextInt();
                h.withdrawal(moneyn);
                break;
                case 3:
                System.out.println("The total  amount was "+h.getBalance());
                break;
                case 4:
                System.out.println("Thankyou for visiting the bank ");
                break;
                default:
                System.out.println("enter the valid choice ");
                    break;
            }
            if (choice == 4) {
            break;  
        }
        }
        break;
            
            
            
            
    
        case 2:
        while(true){
            System.out.println("Welcome to Republic  Bank ");
            System.out.println("1)deposit 2) withdrawal 3)getbalance 4)exit ");
            int choice=sc.nextInt();
            
            switch (choice) {
                case 1:
                System.out.print("enter the money to be deposited ");
                    float money=sc.nextFloat();
                    r.setBalance(money);
                    break;
                case 2:
                System.out.print("enter amount to be withdrawn ");
                int moneyn=sc.nextInt();
                r.withdrawal(moneyn);
                break;
                case 3:
                System.out.println("The total  amount was "+r.getBalance());
                break;
                case 4:
                System.out.println("Thankyou for visiting the bank ");
               break;
                default:
                System.out.println("enter the valid choice ");
                    break;
            }
        if (choice == 4) {
            break;  
        }}
            break;
        
        case 3:
        while(true){
            System.out.println("Welcome to Indian Bank ");
            System.out.println("1)deposit 2) withdrawal 3)getbalance 4)exit ");
            int choice=sc.nextInt();
            
            switch (choice) {
                case 1:
                System.out.print("enter the money to be deposited ");
                    float money=sc.nextFloat();
                    i.setBalance(money);
                    break;
                case 2:
                System.out.print("enter amount to be withdrawn ");
                int moneyn=sc.nextInt();
                i.withdrawal(moneyn);
                break;
                case 3:
                System.out.println("The total  amount was "+i.getBalance());
                break;
                case 4:
                System.out.println("Thankyou for visiting the bank ");
                break;
                default:
                System.out.println("enter the valid choice ");
                    break;
            }if (choice == 4) {
            break;  
        }}
            break;
        case 4:
        System.out.println("Thankyou");
         System.exit(0);
         is=false;
         break;
        case 5:
        System.out.println("indianbank balance "+i.balance);
        System.out.println("republic bank balance "+r.balance);
        System.out.println("Hdfc bank balance "+h.balance);
        break;
    }
    }}
}
