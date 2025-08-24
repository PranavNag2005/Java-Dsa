class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }else{
                freq.put(nums[i],1);
            }
        }
        List<Integer>ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:freq.entrySet()){
            if(entry.getValue()>=2){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
