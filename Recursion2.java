public class Recursion2 {
    private int count=10;
    public void number(){
        if(count<0){
            return;
        }
        System.out.println(count);
        count-=1;
        number();;
    }
 public static void main(String[] args) {
    Recursion2 r=new Recursion2();
    r.number();;
 }   
}
