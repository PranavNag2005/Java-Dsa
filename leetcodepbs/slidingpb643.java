class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double sum = 0;
       double ans = -1000;
       for(int i=0;i<k;i++){
        sum+=arr[i];
       }
       ans = Math.max(ans,sum/k);

       for(int j=k;j<arr.length;j++){
        sum+=arr[j]-arr[j-k];
        ans=Math.max(ans,sum/k);
       }
       return ans;
    }
}
