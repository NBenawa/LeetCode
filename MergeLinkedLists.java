public class MergeLinkedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode mergedHead = mergeTwoLists(l1, l2);
        printList(mergedHead); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            dummy.next = l1;
            dummy.next.next = mergeTwoLists(l1.next, l2);
        } else {
            dummy.next = l2;
            dummy.next.next = mergeTwoLists(l1, l2.next);
        }
        return dummy.next;
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
