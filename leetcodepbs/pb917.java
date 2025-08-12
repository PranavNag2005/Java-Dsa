class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                sb.append(c);
            }
        }
        sb.reverse();   
        StringBuilder sbb=new StringBuilder();
        int index=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
        
            if(Character.isLetter(c)){
                sbb.append(sb.charAt(index));
                index+=1;
            }
            else{
                
                sbb.append(c);
            }}
            return sbb.toString();
    }
}
