package twentyfour;




public class Replacepi {
    public static String replace(String a) {
        if (a.length() < 2) {
            return a;
        }if(a.equals("null")){
            return "''";
        }

        if (a.charAt(0) == 'p' && a.charAt(1) == 'i') {
          
            return "3.14" + replace(a.substring(2));
        } else {
           
            return a.charAt(0) + replace(a.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(replace("piabc"));     
        System.out.println(replace("pipipi"));      
        System.out.println(replace("null"));   
    }
}
