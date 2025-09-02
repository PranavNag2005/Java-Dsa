class Solution {
    public boolean isPerfectSquare(int num) {
        int left=1;
        int right=num/2;
        if(num<2){
            return true;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
             long ans = (long) mid * mid;
            if(ans==num){
                return true;
            }
            else if(ans>num){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}
