class Solution {
    public boolean isPalindrome(ListNode head) {
         ListNode slow=head;
         ListNode fast=head;
         while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }
         ListNode prev=null;
         ListNode current=slow;
         while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
         }
         ListNode start=head;
         ListNode end=prev;
         while(end!=null){
            if(start.val!=end.val){
                return false;
            }
            start=start.next;
            end=end.next;
         }
         return true;
    }
}
