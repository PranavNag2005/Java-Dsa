package twentythree;
import java.util.*;
public class Reversewords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String arr[]=a.split("\\.");
        for(String ad:arr){
            System.out.println(ad);
        }
        String result="";
        for(int i=arr.length-1;i>=0;i--){
            result+=arr[i];
            if(i!=0){
            result+=".";}
        }
        System.out.println(result);
    }
}
