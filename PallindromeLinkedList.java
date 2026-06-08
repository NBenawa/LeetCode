import java.util.ArrayList;
import java.util.List;

public class PallindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head));
    }

    // private static boolean isPalindrome(ListNode head) {
    //     String str = "";
    //     while (head != null) {
    //         str += head.val;
    //         head = head.next;
    //     }
    //     String reversedStr = new StringBuilder(str).reverse().toString();
    //     return str.equals(reversedStr);
    // }

    private static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
