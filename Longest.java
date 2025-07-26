package twentytwo;
import java.util.*;
public class Longest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int currentcount=0;
        int maxcount=0;
        String answer="";
        String words[]=a.split(" ");
        for(int i=0;i<words.length;i++){

            currentcount=words[i].length();
            if(currentcount>maxcount){
                maxcount=currentcount;
                answer=words[i];
            }
        }
        System.out.println(answer+" "+maxcount);
    }
}
