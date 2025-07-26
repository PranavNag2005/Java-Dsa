package twentythree;
class Node{
    String name;
    Node next=null;
    public Node(String name){
        this.name=name;
    }
}
public class TLink {
    static Node head;
    void insertatbegin(String name){
        Node newnode=new Node(name);
        newnode.next=head;
        head=newnode;
    }
    void insertatend(String name){
       Node temp=head;
       if(temp==null){
         Node newnode=new Node(name);
        newnode.next=head;
        head=newnode;
        return;
       }while(temp.next!=null){
        temp=temp.next;
       }
       Node newnode=new Node(name);
       temp.next=newnode;
       newnode.next=null;


    }
    void insertatpos(int pos,String name){
    Node temp=head;
    int count=0;
    if(temp==null|| pos<=0){
        Node newnode=new Node(name);
        newnode.next=head;
        head=newnode;
        return;
    }
    while(count<pos-1 && temp.next!=null){
        temp=temp.next;
        count+=1;
    }
    Node newnode=new Node(name);
    newnode.next=temp.next;
    temp.next=newnode;

    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.name+" -> ");
            temp=temp.next;
        }System.out.println("null");
    }
    void deleteatfirst(){
        Node temp=head;
        temp=temp.next;
        head=temp;
    }
    void deleteatlast(){
        Node temp=head;
        if(temp==null){
            System.out.println("linkedlist is empty ");
            return;
        }
        if(temp.next==null){
            head=null;
            return;
        }
        while(temp.next.next!=null){
            System.out.println(temp.name);
            temp=temp.next;
        }temp.next=null;
    }
    String findmiddleelement(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count+=1;
            temp=temp.next;
        }
        int pos=0;
        temp=head;
        while(pos<count/2 ){
            temp=temp.next;
            pos+=1;
        }
        return temp.name;
    }
    boolean search(String value){
        Node temp=head;
        boolean found=false;;
        while(temp!=null){
            if(temp.name.equals(value)){
                found=true;
                
                return found;
            }temp=temp.next;
        }return found;
    }
    int countnodes(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count+=1;
        }return count;
    }
    public static void main(String[] args) {
        TLink t=new TLink();
        
        
        t.insertatbegin("pranav");
        t.insertatend("praveen");
        t.insertatpos(2, "riyaz");
        t.display();
        // t.deleteatfirst();
        // t.display();
        // t.deleteatlast();
        // t.display();
        // t.insertatbegin("vamsi");
        // System.out.println(t.countnodes());
        // System.out.println(t.search("praveen"));
        System.out.println(t.findmiddleelement());
        
    }
}
