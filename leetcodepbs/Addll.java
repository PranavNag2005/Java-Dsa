package thirtyone;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
public class Addll {
    Node head;
    void insertatfirst(int a){
        Node newnode=new Node(a);
        newnode.next=head;
        head=newnode;

    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }System.out.println();
    }
    Node add(Node head3){
        Node temp=this.head;;
        Node temp2=head3;
        
        Node dummy=new Node(-1);
        Node tail=dummy;
        int carry=0;
        while(temp!=null || temp2!=null || carry!=0){
            int val1=temp!=null?temp.data:0;
            int val2=temp2!=null?temp2.data:0;
            int sum=val1+val2+carry;
            carry=sum/10;
            int digit=sum%10;

            
            tail.next=new Node(digit);
            tail=tail.next;
            if(temp!=null){
            temp=temp.next;}
            if(temp2!=null){
            temp2=temp2.next;}
            
        }return dummy.next;
    }

    Node removeelement(Node head,int val){
        Node temp=head;
        Node dummy=new Node(-1);
        Node tail=dummy;
        while(temp!=null ){
            if(temp.data!=val){
            Node newnode=new Node(temp.data);
            tail.next=newnode;
            tail=tail.next;}
            temp=temp.next;
        }
        return dummy.next;
    }
    Node removeelementinplace(Node head,int val){
        
        Node dummy=new Node(-1);
        dummy.next=head;
        Node temp=dummy;
        if(head==null){
            return null;
        }
        while(temp.next!=null){
            if(temp.next.data==val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;}
        }return dummy.next;
    }
    void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }System.out.println();
    }
    Node[] Alternativesplit(Node head){
        if(head==null){
            return null;
        }
        Node temp=head;
        Node dummy=new Node(-1);
        Node tail=dummy;
        Node dummy2=new Node(-1);
        Node tail2=dummy2;
        int count=0;
        while(temp!=null){
            if(count%2==0){
                Node newnode=new Node(temp.data);
                tail.next=newnode;
                tail=newnode;
            }else{
                Node newnodes=new Node(temp.data);
                tail2.next=newnodes;
                tail2=newnodes;
            }
            count+=1;
            temp=temp.next;
        }
        Node arr[]=new Node[2];
        arr[0]=dummy.next;
        arr[1]=dummy2.next;
        return arr;
    }
    int sumoflastnnodes(Node head,int val){
        Node temp=head;
        int count=0;
        int ans=0;
        while(temp!=null){
            count+=1;
            temp=temp.next;
        }
        temp=head;
        if(val==2 && count==2){
           while(temp!=null){
            ans+=temp.data;
            temp=temp.next;
           }
        }
        int last=count-val;
        temp=head;
        int counter=0;
        while(temp!=null){
            if(counter>=last){
                ans+=temp.data;
            }
            temp=temp.next;
            counter+=1;
        }
        return ans;
    }
 Node insertAtEnd(Node head, int x) {
        // code here
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newnode=new Node(x);
        temp.next=newnode;
        temp=newnode;
        return head;
    }
    public static void main(String[] args) {
        // Addll a=new Addll();
        // a.insertatfirst(3);
        // a.insertatfirst(2);
        // a.insertatfirst(1);
        // Addll b=new Addll();
        // b.insertatfirst(4);
        // b.insertatfirst(6);
        // b.insertatfirst(5);
        // a.display();
        // b.display();
        // Node answer=a.add(b.head);
        // a.display(answer);

        // Addll remove=new Addll();
        
        // remove.insertatfirst(1);
        //  remove.insertatfirst(2);
        //   remove.insertatfirst(3);
        //   remove.insertatfirst(3);

        //   remove.insertatfirst(5);

        //   remove.insertatfirst(6);

        // remove.display();
        // Node removelementanswer=remove.removeelement(remove.head, 2);
        // remove.display(removelementanswer);
        // int val=3;
        // Node inplace=remove.removeelementinplace(remove.head,val);
        // remove.display(inplace);
Addll a=new Addll();
a.insertatfirst(5);
a.insertatfirst(9);
a.insertatfirst(6);
a.insertatfirst(3);
a.insertatfirst(4);
a.insertatfirst(10);
a.display();
// Node arr[]=a.Alternativesplit(a.head);
// a.display(arr[0]);
// a.display(arr[1]);
System.out.println(a.sumoflastnnodes(a.head, 3));

a.insertAtEnd(a.head, 50);
a.display();

    }
}
