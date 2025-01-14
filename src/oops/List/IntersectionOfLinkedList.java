package oops.List;
//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectionOfLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA;
        ListNode second = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (first != null ){
            lengthA++;
            first = first.next;
        }
        while (second != null ){
            lengthB++;
            second = second.next;
        }
        ListNode node1 = headA;
        ListNode node2 = headB;
        if (lengthA < lengthB){
            node2 = findStartNode(node2, lengthB - lengthA);
        }
        if (lengthA > lengthB){
            node1 = findStartNode(node1, lengthA - lengthB);
        }
        while (node1 != node2){
            node1 = node1.next;
            node2 = node2.next;

        }

        return node1;
    }
    private ListNode findStartNode(ListNode node, int end){
        ListNode temp = node;
        for (int i = 0; i < end; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
