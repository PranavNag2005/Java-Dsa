class Solution {
    public static int fractional_node(Node head, int k) {
        // Your code here
        if(head==null){
            return 0;
        }
        int count=0;
        Node temp=head;
        while(temp!=null){
            count+=1;
            temp=temp.next;
        }
        int getans=(int)Math.ceil((double)count / k);

        int counter=1;
        temp=head;
        int answer=0;
        while(temp!=null){
            
            if(counter==getans){
                answer= temp.data;
            }counter+=1;
            temp=temp.next;
        }return answer;
    }
}
