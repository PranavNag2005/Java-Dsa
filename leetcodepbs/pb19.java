class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode forward=head;
        ListNode prev=head;

        if(head.next==null && n==1){
            return head.next;
        }
        for(int i=1;i<=n;i++){
            forward=forward.next;
        }
        if(forward==null){
            return head.next;
        }
        while( forward.next!=null){
            
            prev=prev.next;
            forward=forward.next;
        }prev.next=prev.next.next;
        return head;
    }
}
