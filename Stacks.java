package twentynine;
import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<Integer>();
        s.push(1);
        s.push(23);
        System.out.println(s);
        System.out.println(s.pop());
        s.push(344);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.get(1));
    }
}
