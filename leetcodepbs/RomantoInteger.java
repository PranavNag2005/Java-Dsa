package ONE;
import java.util.*;
public class Roman {
    public static void main(String[] args) {
        HashMap<Character,Integer>a=new HashMap<>();
        a.put('I', 1);
        a.put('V',5);
        a.put('X',10);
        a.put('L',50);
        a.put('C',100);
        a.put('D',500);
        a.put('M',1000);
        int ans=0;
        String roman="IVV";
        for(int i=0;i<roman.length()-1;i++){
            if(i+1<roman.length()&&a.get(roman.charAt(i))<a.get(roman.charAt(i+1))){
                ans-=a.get(roman.charAt(i));
            }else{
                ans+=a.get(roman.charAt(i));
            }
        } ans += a.get(roman.charAt(roman.length() - 1));
        System.out.println(ans);
        
    }
}
