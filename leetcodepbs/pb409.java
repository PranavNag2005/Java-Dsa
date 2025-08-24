class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(freq.containsKey(c)){
                freq.put(c,freq.get(c)+1);
            }else{freq.put(c,1);}
        }
        int length=0;
        boolean hasodd=false;
        for(int value:freq.values()){
            length+=(value/2)*2;
            if(value%2==1){
                hasodd=true;
            }
        }
        return hasodd?length+1:length;
    }
}
