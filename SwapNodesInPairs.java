public class SwapNodesInPairs {
    public static void main(String[] args) {
        
    }

    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode current = temp;

        while (current.next != null && current.next.next != null) {
            ListNode firstNode = current.next;
            ListNode secondNode = current.next.next;
            firstNode.next = secondNode.next;
            current.next = secondNode;
            current.next.next = firstNode;
            current = current.next.next;
        }
        return temp.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}