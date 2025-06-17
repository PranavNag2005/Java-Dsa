package dsa;



import java.util.*;
public class StackusingArray {
	int top=-1;
	static int size;
	int stack[];
	public StackusingArray(int size) {
		stack=new int[size];
	}
	public boolean isfull() {
		if(top==stack.length-1) {
			return true;
		}
		return false;
	}
	public boolean isempty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	void push(int value) {
		if(isfull()) {
			System.out.println("Stack is full cannot push element in it");
			return;
		}
		stack[++top]=value;
		return;
	}
	void pop() {
		if(isempty()) {
			System.out.println("STack is empty cannot pop elements ");
			return;
		}
		System.out.println("popped element was "+stack[top]);
		top--;
	}
	void peek() {
		if(isempty()) {
			System.out.println("STAck is empty cannot show peek value ");
		}
		else {
			System.out.println("peek element was "+stack[top]);
		}
	}
	void display() {
		if (isempty()) {
            System.out.println("Stack is empty");
            return;
        }
		for(int i=0;i<=top;i++) {
			System.out.println(stack[i]);
		}
	}
	
public static void main(String[] args)


{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the stack ");
	size=sc.nextInt();
	StackusingArray s=new StackusingArray(size);
	boolean is=true;
	while(is) {
		System.out.println("1. Push \n 2. POP \n 3. Display \n 4. PEEK \n 5. exit");
		int val=sc.nextInt();
		switch(val) {
		case 1:
			System.out.print("Enter the data to push ");
			int dat=sc.nextInt();
			s.push(dat);
			break;
		case 2:
			s.pop();
			break;
		case 3:
			s.display();
			break;
		case 4:
			s.peek();
			break;
		case 5:
			is=false;
			System.out.println("The program terminated successfully........");
			break;
		default:
			System.out.println("Enter the valid number to perform operations ");
		}
		
	}
	
	
}
}
