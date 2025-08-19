class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int freq[]=new int[123];
        for(int i=0;i<stones.length();i++){
            char c=stones.charAt(i);
            freq[c]++;
           
        }int count=0;
        for(int i=0;i<jewels.length();i++){
            count=count+freq[jewels.charAt(i)];
        }return count;
    }
}
