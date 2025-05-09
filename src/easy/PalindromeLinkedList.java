package easy;

import util.ListNode;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode l3 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l2.next = l3;
        ListNode l1 = new ListNode(2);
        l1.next = l2;
        ListNode head = new ListNode(1);
        head.next = l1;
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversed = reverse(slow.next);
        slow.next = null;
        while(reversed != null && head != null) {

            if (reversed.val != head.val) {
                return false;
            }

            reversed = reversed.next;
            head = head.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode head) {
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
