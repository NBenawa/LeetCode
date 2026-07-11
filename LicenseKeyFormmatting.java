public class LicenseKeyFormmatting {
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        System.out.println(licenseKeyFormatting(s, k));
    }
    private static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '-') {
                if (count == k) {
                    sb.append('-');
                    count = 0;
                }
                sb.append(Character.toUpperCase(c));
                count++;
            }
        }
        return sb.reverse().toString();
    }
}
