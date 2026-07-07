public class RemoveKDigits {
    public static void main(String[] args) {
        String num = "1432419";
        int k = 3;
        String result = removeKDigits(num, k);
        System.out.println("Result after removing " + k + " digits: " + result);
    }

    private static String removeKDigits(String num, int k) {
        if (k >= num.length()) {
            return "0";
        }

        StringBuilder stack = new StringBuilder();

        for (char digit : num.toCharArray()) {
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > digit) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(digit);
        }

        // Remove remaining digits from the end if k > 0
        while (k > 0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

        // Remove leading zeros
        int index = 0;
        while (index < stack.length() && stack.charAt(index) == '0') {
            index++;
        }

        String result = stack.substring(index);
        return result.isEmpty() ? "0" : result;
    }
}
