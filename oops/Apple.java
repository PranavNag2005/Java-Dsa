package twentyeight;

class Fruit{
    int a=10;
    public void taste(){
        System.out.println("Taste method in Fruit class");
    }
}
public class Apple extends Fruit {
    public void taste(){
        System.out.println("Apple was sweet ");
    }
    public static void main(String[] args) {
        Fruit a=new Apple();
        a.taste();
        System.out.println(a.a);
    }
}
