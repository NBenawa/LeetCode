public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "a#b#c";
        String t = "a#d#c";
        boolean result = backspaceCompare(s, t);
        System.out.println(result); // Output: true
    }
    private static boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }
    private static String buildString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                str = str.substring(0, i-1) + buildString(str.substring(i+1, str.length()));
            }
        }
        return str;
    }
}
