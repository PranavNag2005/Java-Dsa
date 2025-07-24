package twentyfour;

public class Replacex {
    public static String replacexwithy(String s){
        s=s.toLowerCase();
        if(s.length()==0){
            return "";
        }
        if(s.charAt(0)=='x'){
            return 'y'+replacexwithy(s.substring(1));
        }else{
            
            return s.charAt(0)+replacexwithy(s.substring(1));
        }
        
    }
    public static void main(String[] args) {
        System.out.println(replacexwithy("yy"));
    }
}
