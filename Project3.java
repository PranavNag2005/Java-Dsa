
import java.util.*;
public class Project3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="abcdefghijklmnopqrstuvwxyz^&(){}[]?<>,.ABCDEFGHIKJLMNOPQRSTUVWXYZ123456789@#$%!*0";
        StringBuilder sb=new StringBuilder();
        System.out.print("Enter the length of password : ");
        int n=sc.nextInt();
        int len=0;
        while(len<n){
        
        int randInt = (int)(Math.random() * s.length());
        sb.append(s.charAt(randInt));
        len+=1;
        }
    System.out.println(sb.toString());
    }
}
