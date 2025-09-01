class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max){
                if(max>=2*nums[i]){
                    continue;
                }else{
                    index=-1;
                    break;
                }
            }
        }
        return index;
    }
}
