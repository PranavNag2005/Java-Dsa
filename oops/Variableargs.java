

public class Variableargs {
static int sums(int ...n){
   int sum=0;
    for(int a :n){
        sum+=a;
    }return sum;
}
    public static void main(String[] args) {
        System.out.println(sums(1,2,3,4567));
    }
}
