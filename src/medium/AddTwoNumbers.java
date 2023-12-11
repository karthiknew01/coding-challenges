package medium;

import medium.helper.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers/submissions/1116725639/
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode l3 = addTwoNumbers(l1, l2);
        do {
            System.out.println(l3.val);
            l3 = l3.next;
        } while (l3 != null);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rootNode = null;
        ListNode currentNode = null;
        boolean carry = false;
        do {
            ListNode finalNode = new ListNode();
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + (carry ? 1 : 0);
            finalNode.val = sum % 10;
            carry = sum > 9;
            if (rootNode == null) {
                rootNode = finalNode;
                currentNode = finalNode;
            } else {
                currentNode.next = finalNode;
                currentNode = currentNode.next;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        } while (l1 != null || l2 != null || carry);
        System.gc();
        return rootNode;
    }
}

