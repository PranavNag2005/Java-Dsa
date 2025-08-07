package ONE;

import java.util.ArrayList;

public class Pb {
    
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        ArrayList<String>a=new ArrayList<>();
        String word="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
        
            if(c!=' '){
                word+=c;
               
            }else{
                if(!word.isEmpty()){
                a.add(word);}
                word="";
            }
        }if(!word.isEmpty()){
            a.add(word);
        }
       
        String answer=a.get(a.size()-1);
        return answer.length();
        
        
            
}
public static void main(String[] args) {
    String word="   fly me   to   the moon  ";
    
    System.out.println(lengthOfLastWord(word));
}
}
