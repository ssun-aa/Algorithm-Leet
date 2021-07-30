public class leet24 {
    /*Definition for singly-linked list.*/
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            if(head == null || head.next == null)
                return head;
            ListNode h = new ListNode(0);
            h.next = head;
            ListNode p = h;
            while(p.next!=null && p.next.next!=null){
                p.next = head.next;
                head.next = p.next.next;
                p.next.next = head;
                p = head;
                head = head.next;
            }
            return h.next;
        }
    }
}
