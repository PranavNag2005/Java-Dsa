class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int answer[]=new int[queries.length];
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for (int i = 0; i < queries.length; i++) {
            int q = queries[i];
            int left = 0, right = nums.length - 1, res = 0;


            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (prefix[mid] <= q) {
                    res = mid + 1; 
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            answer[i] = res;
        }
        return answer;
 
    }
}
