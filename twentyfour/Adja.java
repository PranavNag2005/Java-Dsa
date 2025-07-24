package twentyfour;

public class Adja {
   public static String removeadjacent(String s){
    if(s.length()<=1){
        return s;
    }
    if(s.charAt(0)==s.charAt(1)){
       
        return removeadjacent(s.substring(1));
    }else{
        return s.charAt(0)+s.substring(1);
    }
   
   } 
   public static void main(String[] args) {
    System.out.println(removeadjacent("aaaa"));
   }
}
