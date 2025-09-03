class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int mindiff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int currentdiff=Math.abs(arr[i]-arr[i-1]);
            mindiff=Math.min(mindiff,currentdiff);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == mindiff) {
                ans.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return ans;
    }
}
