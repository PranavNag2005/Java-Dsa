
public class Slide {
  
    public static void main(String[] args) {
        int arr[]={1,9,0,4};
        int k=2;
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        ans=Math.max(sum,ans);
        for(int j=k;j<arr.length;j++){
            sum+=arr[j]-arr[j-k];
            ans=Math.max(sum,ans);
        }
        System.out.println(ans);
        System.out.println(Integer.MIN_VALUE);
    }
}
