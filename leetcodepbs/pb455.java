class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length<1 || g.length<1){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0;
        int left=0;
        int right=0;
        while(left<g.length && right<s.length){
            if(s[right]>=g[left]){
                ans+=1;
                left+=1;
                right+=1;
                
            
            }
            else{
                right+=1;
            }

        }
        return ans;
    }
}
