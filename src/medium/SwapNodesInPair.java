package medium;

import medium.helper.ListNode;

/**
 * <a href="https://leetcode.com/problems/swap-nodes-in-pairs/description/">...</a>
 */
public class SwapNodesInPair {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        head = swapPairs(head);
        do {
            System.out.println(head.val);
            head = head.next;
        } while (head != null);

    }

    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;

        return temp;
    }
}
