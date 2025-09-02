class Solution {
    public boolean judgeSquareSum(int c) {
        int left=0;
        long right=(long)Math.sqrt(c);
        while(left<=right){
           
            long sum=left*left+right*right;
            if(sum==c){
                return true;
            }
            else if(sum>c){
                right-=1;
            }
            else{
                left+=1;
            }
        }
        return false;
    }
}
