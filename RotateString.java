public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "eabcd";
        boolean result = rotateString(s, goal);
        System.out.println("Can rotate: " + result);
    }

    private static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int startIndex = goal.indexOf(s.charAt(0));
        return control(s, startIndex, goal);
    }

    private static boolean control(String s, int index, String goal) {
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) != goal.charAt((index + k) % goal.length())) {
                return false;
            }
        }
        return true;
    }
}