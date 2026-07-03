public class ValidPallindromeII {
    public static void main(String[] args) {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        boolean result = validPalindrome(s);
        System.out.println("Is valid palindrome: " + result);
    }

    private static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        boolean skipped = false;
        boolean skipChecked = false;

        while (left < right) {
                if (skipped && skipChecked && (s.charAt(left) != s.charAt(right))) {
                    return false;
                }
                if (skipped && s.charAt(left) != s.charAt(right)) {
                    left--;
                    right--;
                    skipChecked = true;
                    continue;
                }
                if (s.charAt(left) != s.charAt(right)) {
                    left++;
                    skipped = true;
                    continue;
                }
                left++;
                right--;
                if (skipped) {
                    skipChecked = true;
                }
        }
        return true;
    }
}