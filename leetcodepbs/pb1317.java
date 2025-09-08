class Solution {
    public static boolean containszero(int i){
        while(i>0){
            if(i%10==0){
                return true;
            }
            i=i/10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        int ans[]=new int[2];
        for(int i=1;i<n;i++){
            int a=i;
            int b=n-i;
            if(!containszero(a) && !containszero(b)){
                ans[0]=a;
                ans[1]=b;
                return ans;
            }
           
        }
        return ans;
    }
}
