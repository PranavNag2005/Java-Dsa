class Solution {
    public int hammingWeight(int n) {
            String s=Integer.toBinaryString(n);
            int count=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='1'){
                    count+=1;
                }
            }
            return count;
    }
}
