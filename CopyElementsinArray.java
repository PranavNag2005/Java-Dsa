package prepinsta;
import java.util.*;
public class CopyElementsinArray {
public static   void printarray(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of the array ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("The original array elements are ");
	printarray(arr);
	int temparray[]=new int[n];
	for(int i=0;i<n;i++) {
		temparray[i]=arr[n-i-1];
	}
	System.out.println("The elements copied from array are ");
	printarray(temparray);
	
}
}
