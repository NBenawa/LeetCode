import java.util.HashSet;

public class MorseCodeWords {
    static String[] morse = {
            ".-",    // A
            "-...",  // B
            "-.-.",  // C
            "-..",   // D
            ".",     // E
            "..-.",  // F
            "--.",   // G
            "....",  // H
            "..",    // I
            ".---",  // J
            "-.-",   // K
            ".-..",  // L
            "--",    // M
            "-.",    // N
            "---",   // O
            ".--.",  // P
            "--.-",  // Q
            ".-.",   // R
            "...",   // S
            "-",     // T
            "..-",   // U
            "...-",  // V
            ".--",   // W
            "-..-",  // X
            "-.--",  // Y
            "--.."   // Z
    };
    public static void main(String[] args) {
        String[] words = new String[] {"gin", "zen", "gig", "msg"};
        System.out.println(morseTransformations(words));
    }

    private static int morseTransformations(String[] words) {
        HashSet<String> transformations = new HashSet<>();
        for (String word : words) {
            word = word.toLowerCase();
            String codedWord = "";
            char[] chars = word.toCharArray();
            for (Character c : chars) {
                codedWord += (String) morse[Character.hashCode(c)-97];
            }
            if (!transformations.contains(codedWord)) {
                transformations.add(codedWord);
            }
        }
        return transformations.size();
    }

}
