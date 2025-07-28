package twentyeight;
class Vehicle{
    public void start(){
        System.out.println("In vehicle class with start method");
    }
}
public class Car extends Vehicle{
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
    }
}
