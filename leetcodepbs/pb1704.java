class Solution {
    public static  boolean countvowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }return false;
    }
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2);
        int count1=0;
        int count2=0;
        for(int i=0;i<a.length();i++){
            if(countvowel(a.charAt(i))){
                count1+=1;
            }
        }
        for(int i=0;i<b.length();i++){
            if(countvowel(b.charAt(i))){
                count2+=1;
            }
        }return count1==count2;
    }
}
