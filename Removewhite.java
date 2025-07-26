package twentytwo;
import java.util.*;
public class Removewhite {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String a="";
    for(int i=0;i<s.length();i++){
        char temp=s.charAt(i);
        if(temp>='A' && temp<='Z' || temp>='a' &&temp<='z'){
            a+=temp;
        }
    }
    System.out.println(a);
  }  
}
