class Solution {
    public int missingNumber(int[] nums) {
        List<Integer>a=new ArrayList<>();
        for(int num:nums){
            a.add(num);
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<=nums.length;i++){
            if(!a.contains(i)){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
