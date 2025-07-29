package twentynine;
abstract class bike{
abstract public void speed();
}
class BMw extends bike{
  public   void speed(){
        System.out.println("my speed was around 120kmph");
    }
}
class Jawa extends BMw{
    public void speed(){
        
        System.out.println("my speed was around 150kmph");
    }
}
public class ABSTRACT {
    public static void main(String[] args) {
        Jawa j=new Jawa();
        j.speed();
    }
}
