class Solution {
    public boolean isPalindrome(ListNode head) {
       ArrayList<Integer>a=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
        a.add(temp.val);
        temp=temp.next;
       } 
       int left=0;
       int right=a.size()-1;
       while(left<=right){
        if(a.get(left)!=a.get(right)){
            return false;
        }
        left+=1;
        right-=1;
       }return true;
    }
}
