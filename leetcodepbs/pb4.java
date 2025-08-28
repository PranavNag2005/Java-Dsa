class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>num=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            num.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            num.add(nums2[i]);
        }
        Collections.sort(num);
        int size=num.size();
        if(size%2==0){
            return (num.get(size/2-1 )+num.get(size/2))/2.0;
        }else{
            return (double)num.get(size/2);
        }
    }
}
