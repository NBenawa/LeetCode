public class ReverseOnlyStringLetters {
    public static void main(String[] args) {
        String string = "7_28";
        System.out.println(reverseStringLetters(string));
    }

    private static String reverseStringLetters(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while (start < end) {
            if (!Character.isLetter(chars[start])) {
                start++;
                continue;
            }
            if (!Character.isLetter(chars[end])) {
                end--;
                continue;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
