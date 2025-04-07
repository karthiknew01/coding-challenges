package hard;

import util.ListNode;

/**
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/">...</a>
 */
public class MergedKSortedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(11);
        l1.next.next.next.next.next.next = new ListNode(13);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(8);

        ListNode[] lists = {l1, l2};

        ListNode l3 = mergeKLists(lists);

        assert l3 != null;
        l3.printList();
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        return binaryMerge(lists, 0, lists.length - 1);
    }

    private static ListNode binaryMerge(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }

        int mid = left + (right - left) / 2;

        ListNode l1 = binaryMerge(lists, left, mid);
        ListNode l2 = binaryMerge(lists, mid + 1, right);

        return merge2List(l1, l2);

    }

    private static ListNode merge2List(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(0);
        ListNode merge = curr;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else if (l2.val < l1.val) {
                curr.next = l2;
                l2 = l2.next;
            } else {
                curr.next = l1;
                l1 = l1.next;

                curr = curr.next;

                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        } else {
            curr.next = l2;
        }

        return merge.next;
    }
}
