public class JewelsAndStones {
    public static void main(String[] args) {
        String stones = "aA";
        String jewels = "aAAbbbb";
        System.out.println(jewelsAndStones(jewels, stones));
    }

    private static int jewelsAndStones(String jewels, String stones) {
        return (int) jewels.chars().filter(c -> stones.indexOf(c) != -1).count();
    }
}