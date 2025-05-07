package easy;

import util.ListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode head = new ListNode(1);
        head.next = l1;

        head = reverseList(head);
        head.printList();
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

}
