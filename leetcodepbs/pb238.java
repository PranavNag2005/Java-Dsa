class Solution {
    public int[] productExceptSelf(int[] arr) {
       
        int Prefixs[]=new int[arr.length];
        Prefixs[0]=1;
        for(int i=1;i<arr.length;i++){
            Prefixs[i]=Prefixs[i-1]*arr[i-1];
        }
        
        int suffix[]=new int[Prefixs.length];
        suffix[suffix.length-1]=1;
        for(int i=suffix.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Prefixs[i] * suffix[i];
        }
    return result;


    }
}
