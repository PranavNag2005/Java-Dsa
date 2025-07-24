package twentyfour;

public class Ntowords {
   public static String words(int n){
    if(n==0){return "zero";}
    if(n==1){return "one";}
    if(n==2){return "two";}if(n==3){return "three";}if(n==4){return "four";}
    if(n==5){return "five";}if(n==6){return "six";}if(n==7){return "seven";}
    if(n==8){return "eight";}if(n==9){return "nine";}
    if(n<10){
        return words(n);
    }
    return words(n/10)+" "+words(n%10);
} 
public static void main(String[] args) {
    System.out.println(words(123));
}
}
