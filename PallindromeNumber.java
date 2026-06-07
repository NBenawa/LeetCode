import java.util.ArrayList;
import java.util.List;

public class PallindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
    private static boolean isPalindrome(int x) {
        List<Integer> digits = new ArrayList<>();
        while (x > 0) {
            digits.add(x % 10);
            x /= 10;
        }
        int left = 0;
        int right = digits.size() - 1;
        while (left < right) {
            if (digits.get(left) != digits.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
