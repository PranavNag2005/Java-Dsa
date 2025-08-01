package ONE;
import java.util.*;
public class Arraylist {
   public static void main(String[] args) {
    ArrayList<String> a=new ArrayList<String>();
    a.add("Ram");
    a.add("Raju");
    a.add("vijay");
    a.add("vinay");
    a.add("siva");
    System.out.println(a);
    String temp=a.get(1);
    a.set(1, a.get(4));
    a.set(4, temp);
    System.out.println(a);
    //Removing of siva
    a.remove("siva");
    System.out.println(a);
    //alphabetically order
Collections.sort(a);
System.out.println(a);

ArrayList<String>fruits=new ArrayList<>();
fruits.add("apple");
fruits.add("pear");fruits.add("mango");fruits.add("banana");
System.out.println(fruits);
//sort the list 
Collections.sort(fruits);

System.out.println(fruits);
//and then reverse the list to get desired output

Collections.reverse(fruits);
System.out.println(fruits);
Collections.shuffle(fruits);
System.out.println(fruits);
   } 
}
