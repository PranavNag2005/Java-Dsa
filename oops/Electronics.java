package twentyeight;
class Product{
    String name;
    float amount;
    public Product(String name,float amount){
        this.name=name;
        this.amount=amount;
    }
}
public class Electronics extends Product {
    int warranty;
    public Electronics(String name,float amount,int warranty){
        super(name,amount);
        this.warranty=warranty;
    }
    public static void main(String[] args) {
        Electronics e=new Electronics("LAPTOP", 60000, 2);
        System.out.println("this "+e.name+" has "+e.warranty+" years of warranty of price "+e.amount);
    }
}
