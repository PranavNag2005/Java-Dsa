package twentytwo;
import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String a=sc.nextLine();
       String b=sc.nextLine();
       if(a.length()!=b.length()){
        System.out.println("not anagrams ");
       }
    char arr[]=a.toCharArray();
    char arr1[]=b.toCharArray();
       Arrays.sort(arr);
       Arrays.sort(arr1);
       if(Arrays.equals(arr, arr1)){
        System.out.println("anagrams ");
       }else{
        System.out.println("not anagrams");
       }
    
    
    }
}
