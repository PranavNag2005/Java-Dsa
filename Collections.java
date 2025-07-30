package twentynine;
import java.util.*;
public class Collections {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(33);
        //displaying the Arraylist
        System.out.println(list);
        //remove of an element
        list.remove(2);
        System.out.println(list);
        //checking particular element present or not
        System.out.println(list.contains(100));
        //creating other list 
        List<Integer>a=new ArrayList<>();
        a.add(123);
        a.add(1345);
        System.out.println(a);
        // merging two lists;
        list.addAll(a);
        System.out.println(list);
        //clear is used to remove 
        a.clear();;
        System.out.println(a);
        
        //Iterator interface for traversing
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
       
    }
}
