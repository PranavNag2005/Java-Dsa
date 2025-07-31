package thirtyone;
import java.util.*;
class Players extends Thread{
    String name;
    public Players(String name){
        this.name=name;
    }public void run(){
        System.out.println(name+" is playing "+Thread.currentThread().getName());
    }
}
public class Threads  {
    public static void main(String[] args) {
       Thread t1=new Players("Dhawan");
       Thread t2=new Players("kohli");
       Thread t3=new Players("rohit");
       Thread t4=new Players("suresh raina");
       Thread t5=new Players("gambhir");
       Thread t6=new Players("pant");     
      t1.start();t2.start();t3.start();t4.start();t5.start();t6.start();
    }
}
