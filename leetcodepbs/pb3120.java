class Solution {
    public int numberOfSpecialChars(String word) {
        int ans=0;
        int freq[]=new int[52];
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isLowerCase(c)){
                freq[c-'a']+=1;
            }
            else{
                freq[c-'A'+26]++;
            }

        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0 && freq[i + 26] > 0) {
                ans++;
            }
        }
    return ans;
    }
}
