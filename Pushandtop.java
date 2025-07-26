package twentyfive;
import java.util.*;
public class Pushandtop {
    int size;
    int arr[]=new int[size];
    int top;
    public Pushandtop(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }
    public boolean isfull(){
        return top==arr.length-1;
    }
    public boolean isempty(){
        return top==-1;
    }
    public void push(int x){
        if(isfull()){
            System.out.println("stack overflow "+x);
            return;
        }
        System.out.println("pushed element was "+x);
        arr[++top]=x;
    }
    public void pop(){
        if(isempty()){
            System.out.println("stack underflow");
            return;
        }
        System.out.println("popped element was "+arr[top--]);

    }
    public void peek(){
        if(isempty()){
            System.out.println("no element to peek ");
            return;
        }System.out.println("top element was "+arr[top]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size ");
        int size=sc.nextInt();
        Pushandtop p=new Pushandtop(size);
        while(true){
            System.out.println("1.push 2.pop 3. peek ");
            int num=sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("you are in push operation ");
                    System.out.print("enter the value ");
                    int data=sc.nextInt();
                    p.push(data);
                    break;
                case 2:
                    p.pop();;
                    break;
                case 3:
                p.peek();;
                break;
                case 4:
                System.exit(0);
                break;
                default:
                System.out.println("enter valid operations ");
                    break;
            }
        }
    }
}
