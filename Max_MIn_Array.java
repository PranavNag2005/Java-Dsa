package prepinsta;
import java.util.*;
public class Max_MIn_Array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the size of the array ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	for(int i=0;i<n;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	for(int a:arr) {
		System.out.println(a);
	}
	System.out.println(max+" "+min);
}
}
