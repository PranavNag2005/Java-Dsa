package twentyfour;

public class Zero {
    public static int count(int n){
        int noofzeroes=0;
        if(n==0){
            noofzeroes+=1;
        }else if(n<10){
            noofzeroes=0;
        }
        else if(n%10==0){
            noofzeroes=count(n/10)+1;
        }else if(n%10!=0){
            noofzeroes=count(n/10);
        }
        return noofzeroes;
    }
    public static void main(String[] args) {
        System.out.println(count(100));
      
    }
}
