public class WordsFormedFromChars {
    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        int result = countCharacters(words, chars);
        System.out.println("Total length of words that can be formed: " + result);
    }

    private static int countCharacters(String[] words, String chars) {
        int totalLength = 0;

        for (String word : words) {
            if (canFormWord(word, chars)) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }

    private static boolean canFormWord(String word, String chars) {
        char[] charsCounter = new char[26];
        for (char c : chars.toCharArray()) {
            charsCounter[c - 97]++;
        }

        for (char c : word.toCharArray()) {
            if (charsCounter[c - 97] == 0) {
                return false;
            }
            charsCounter[c - 97]--;
        }
        return true;
    }
}
