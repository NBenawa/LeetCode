import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = new String[] {"cool","lock","cook"};
        System.out.println(commonChars(words));
    }

    private static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        for (char c : words[0].toCharArray()) {
            if (isCommon(c, words)) {
                result.add(String.valueOf(c));
            }
        }
        return result;
    }

    private static boolean isCommon(char c, String[] words) {
        for (String word : words) {
            if (!word.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}
