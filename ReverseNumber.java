public class ReverseNumber {
    public static void main(String[] args) {
        int num = -120;
        System.out.println(reverse(num));
    }
    private static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }
    
}
