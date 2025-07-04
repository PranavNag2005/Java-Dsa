package prepinsta;
import java.util.*;
public class TwosumSorted {
	
	    public static int[] twoSum(int[] nums, int target) {
	        int left=0;
	        int right=nums.length-1;
	        while(left<right){
	            if(nums[left]+nums[right]==target){
	                return new int[]{left+1,right+1};
	            }
	            if(nums[left]+nums[right]>target){
	                right-=1;
	            }else{
	                left+=1;
	            }
	        }
	        return new int[]{left+1,right+1};
	    }
	    
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int target=sc.nextInt();
int result[]=twoSum(arr,target);
for(int ans:result) {
	System.out.println(ans);
}


}
}
