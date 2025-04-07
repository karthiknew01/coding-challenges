package easy;

import util.ListNode;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/">...</a>
 */
public class RemoveDuplicatesSortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(3);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);

        head = deleteDuplicates(head);
        head.printList();
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;

        ListNode temp = head;

        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return temp;
    }
}
