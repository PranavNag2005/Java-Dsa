package thirty;

import java.util.ArrayList;

class Node{
    int data;
    Node prev,next;
    public Node(int data){
        this.data=data;
        prev=next=null;
    }
}
public class Doublesinglyll {
    Node head;
    void insertatfirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        newnode.prev=null;
        if(head!=null){
            head.prev=newnode;
        }
        head=newnode;
    }
    void display(){
        Node temp=head;
        Node prev=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }System.out.println();
       
    }
    void displayreverse(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+" <-");
            temp=temp.prev;
        }System.out.println();
    }
    void insertatpos(int data,int pos){
        Node temp=head;
        if(head==null){
            insertatfirst(data);
            return;
        }
        int count=0;
        while(count<pos-1 && temp.next!=null){
            temp=temp.next;
            count+=1;
        }
        Node newnode=new Node(data);
        newnode.next=temp.next;
        newnode.prev=temp;
        temp.next=newnode;
        if (newnode.next != null) {
    newnode.next.prev = newnode;
}

        
    }

    void insertatend(int data){
        Node temp=head;
        if(head==null){
            insertatfirst(data);
            return;
        }
        while (temp.next!=null) {
            temp=temp.next;
        }
        Node newnode=new Node(data);
        temp.next=newnode;
        newnode.prev=temp;
        
    }
    void deleteatfirst(){
        Node temp=head;
        if(head==null){
            return;
        }
        head=head.next;
        if(head!=null){
            
            head.prev=null;
        }
    }
    void deleteatend(){
        Node temp=head;
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void main(String[] args) {
        Doublesinglyll d=new Doublesinglyll();
        d.insertatfirst(100);
        d.insertatfirst(1234);
        d.display();
        d.insertatfirst(123);
       
        d.insertatend(24);
        
        
        d.insertatpos(10000, 1);
       d.display();
        d.deleteatfirst();
        d.display();
        d.deleteatend();
        d.display();
    
    d.display();;
   
    }
}
