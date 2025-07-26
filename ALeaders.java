package twentytwo;
import java.util.*;
public class ALeaders {

    public static void main(String[] args) {
        int arr[]={16,17,4,2,1};
        int left=0;
        int right=1;
        ArrayList<Integer>a=new ArrayList<>();
        while(left<arr.length){
            int temp=arr[left];
            if(temp>arr[right]){
                right+=1;
            }
            
           else
           {if(right==arr.length-1){
            a.add(temp);
           }
            left+=1;

           }
        }
        System.out.println(a);
    }
}