public class leet21 {

/* Definition for singly-linked list.*/
    static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        ListNode node = new ListNode(0);
        ListNode next = node;

        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                next.next = l1;
                l1 = l1.next;
            }
            else{
                next.next = l2;
                l2 = l2.next;
            }
            next = next.next;
        }
        if(l1 == null)
            next.next = l2;
        if(l2 == null)
            next.next = l1;

        return node.next;
    }
}
