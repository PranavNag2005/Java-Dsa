package ONE;

public class Palindrome {
    public static boolean isPalinSent(String s) {
        // code here
        StringBuffer sb=new StringBuffer();
        s=s.toLowerCase();
      
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&& c<='z' || c>='0'&&c<='9'){
                sb.append(c);
            }
        }
       
        if(sb.length()<2){
            return true;
        }
        int left =0;
        int right=sb.length()-1;
        while(left<=right){
            if(sb.charAt(left)!=sb.charAt(right)){
                return false;
            }
            left+=1;right-=1;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="414H";
  
        System.out.println(isPalinSent(s));

    }
}
