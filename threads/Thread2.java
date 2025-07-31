package thirtyone;

public class Thread2 implements Runnable {
    String name;
    public Thread2(String name){
        this.name=name;
    }
    public void run(){
        System.out.println("My name is "+this.name+" and is called from "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
       Thread object=new Thread(new Thread2("pranav"));
       object.start();
       Thread object1=new Thread(new Thread2("pranavnag"));
       Thread objects1=new Thread(new Thread2("vamsi"));
       object1.start();
       objects1.start();
    }
}
