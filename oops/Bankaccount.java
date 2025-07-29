package twentynine;

public class Bankaccount {
    private float balance;
    void deposit(int amount){
        this.balance+=amount;
        System.out.println("deposited successfully ");
    }
    void withdraw(int money){
        if(this.balance>=money){
            System.out.println(money+" with draw successfully ");
            this.balance-=money;
        }else{
            System.out.println("Insufficient funds ... ");
        }
    }
    float getbalance(){
        return this.balance;
    }
    public static void main(String[] args) {
        Bankaccount b=new Bankaccount();
        b.deposit(1000);
        System.out.println(b.getbalance());
        b.withdraw(1000);
        b.withdraw(1223);
        b.deposit(10000);
        System.out.println(b.getbalance());
        b.withdraw(10000);
    }
}
