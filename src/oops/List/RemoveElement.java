package oops.List;
//https://leetcode.com/problems/remove-linked-list-elements/description/
//https://leetcode.com/problems/delete-node-in-a-linked-list/

public class RemoveElement {
//Not Solved
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return head;
        }
        ListNode node = head;
        while (node != null){
            if (node.val == val){
                node = node.next;
                head = node;
            }
        }
        ListNode node1 = head;

        if (node1 != null){
            while (node1.next != null){
                if (node1.next.val == val){
                    ListNode node2 = node1.next;
                    node1.next = node2.next;
                }
                node1 = node1.next;
            }
        }
        return head;
    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
}
