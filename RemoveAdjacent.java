class RemoveAdjacent {
    public static void main(String[] args) {
        String input = "abbbaca";
        String result = removeAdjacent(input);
        System.out.println("Result: " + result);
    }

    private static String removeAdjacent(String s) {
        StringBuilder sb = new StringBuilder();
        char letterToRemove = '\0'; // Initialize with a character that won't match any letter in the string
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1); // Remove the last character
                letterToRemove = c; // Reset the letter to remove
            } else {
                if (c != letterToRemove) {
                    sb.append(c); // Add the current character
                }
                letterToRemove = '\0'; // Update the letter to remove
            }
        }
        return sb.toString();
    }
}