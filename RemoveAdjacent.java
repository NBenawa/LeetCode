class RemoveAdjacent {
    public static void main(String[] args) {
        String input = "abbaaca";
        String result = removeAdjacent(input);
        System.out.println("Result: " + result);
    }

    private static String removeAdjacent(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1); // Remove the last character
            } else {
                sb.append(c); // Add the current character
            }
        }
        return sb.toString();
    }
}