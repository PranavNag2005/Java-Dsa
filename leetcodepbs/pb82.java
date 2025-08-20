class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer, Integer> h = new HashMap<>();
        ListNode temp = head;
        
       
        while (temp != null) {
            h.put(temp.val, h.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }
  
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        temp = head;
        
        while (temp != null) {
            if (h.get(temp.val) == 1) {
                tail.next = new ListNode(temp.val);
                tail = tail.next;
            }
            temp = temp.next;
        }
        
        return dummy.next;
    }
}
