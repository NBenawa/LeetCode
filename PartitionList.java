public class PartitionList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        ListNode arranged = arrangeList(head);
        printList(arranged);
    }

    private static ListNode arrangeList(ListNode head) {
        ListNode init = new ListNode(0);
        while (head != null && head.next != null) {
            if (head.val > head.next.val) {
                init.next = head.next;
            } else {
                init.next = head;
            }
            head = head.next;
        }
        return init.next;
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current.next != null) {
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println(current.val);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}
