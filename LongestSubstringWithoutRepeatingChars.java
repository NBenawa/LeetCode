public class LongestSubstringWithoutRepeatingChars {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingChars solution = new LongestSubstringWithoutRepeatingChars();
        String input = "abcabcbb";
        int length = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] index = new int[128]; // Assuming ASCII character set
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}