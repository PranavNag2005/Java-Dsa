package twentyfive;

public class Queue {
   int arr[];
   int front;
   int rear;
   public Queue(int size){
    arr=new int[size];
    front=0;
    rear=-1;

   }
   boolean isfull(){
    return rear==arr.length-1;
   }
   boolean isempty(){
    return rear < front;
   }
   void enqueue(int data){
    if(isfull()){
        System.out.println("queue overflow ");
    }
    arr[++rear]=data;
    System.out.println("Enqueued elemnents are "+data);
    
   }
   int  dequeue(){
    if(isempty()){
        System.out.println("cannot dequeue element s");
        return -1;
    }
    
    return arr[front++];
   }
   void display(){
    System.out.println("elements in the qeueue");
    for(int i=front;i<=rear;i++){
System.out.println(arr[i]);
    }
       
    
   }
   public static void main(String[] args) {
    Queue a=new Queue(5);
    a.enqueue(45);
    a.enqueue(50);
    System.out.println("dequeed elements "+a.dequeue());
System.out.println("is empty ? "+a.isempty());
a.display();
   }
}
