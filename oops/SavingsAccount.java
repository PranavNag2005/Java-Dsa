package twentyeight;
class Account{
    int balance;
    public Account(int balance){
        this.balance=balance;
    }
}
public class SavingsAccount extends Account {
    int time;
    float rate;
    int balance=super.balance;
    public SavingsAccount(int balance,int time,float rate){
        super(balance);
        this.time=time;
        this.rate=rate;
        
    }
    public float getInterest(int balance,int time,float rate){
        float result=(balance*time*rate)/100;
        super.balance+=result;
        
        return result;
    }
    public float checkbalance(){
        
        return super.balance;
    }
    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount(1000,1, 1);
        System.out.println(s.getInterest(s.balance ,s.time , s.rate));
        System.out.println(s.checkbalance());
    }
}
