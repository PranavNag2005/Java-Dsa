public class PalindromicArray {
    public static boolean isPalinArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int number=arr[i];
            int temp=number;
            int result=0;
            while(temp>0){
                int rem=temp%10;
                result=result*10+rem;
                temp/=10;
            }
            if(number!=result){
                return false;
            }

        }return true;
    }
    public static void main(String[] args) {
        int arr[]={111,222,3344};
        System.out.println(isPalinArray(arr));
    }
}
