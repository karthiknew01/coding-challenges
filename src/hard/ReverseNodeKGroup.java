package hard;

import medium.helper.ListNode;

/**
 * <a href="https://leetcode.com/problems/reverse-nodes-in-k-group/">...</a>
 */
public class ReverseNodeKGroup {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = reverseKGroup(head, 3);
        head.printList();
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode curr = head;
        ListNode newHead = null;
        ListNode end = null;

        while (curr != null) {
            ListNode group = curr;
            ListNode next;
            ListNode prev = null;
            int i = 0;

            while (curr != null && i < k) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                i++;
            }

            if (i < k) {
                prev = reverseList(prev);
            }

            if (newHead == null)
                newHead = prev;

            if (end != null)
                end.next = prev;

            end = group;
        }

        return newHead;
    }

    public static ListNode reverseList(ListNode head) {

        // Initialize three pointers: curr, prev and next
        ListNode curr = head, prev = null, next;

        // Traverse all the nodes of Linked List
        while (curr != null) {

            // Store next
            next = curr.next;

            // Reverse current node's next pointer
            curr.next = prev;

            // Move pointers one position ahead
            prev = curr;
            curr = next;
        }

        // Return the head of reversed linked list
        return prev;
    }

}
