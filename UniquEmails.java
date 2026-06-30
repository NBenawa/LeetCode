import java.util.HashSet;

public class UniquEmails {
    public static void main(String[] args) {
        String[] emails = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(uniqueEmails(emails));
    }

    private static int uniqueEmails(String[] emails) {
        HashSet<String> uniqueEmails = new HashSet<>();
        for (String string : emails) {
            String username = string.split("\\@")[0].split("\\+")[0].replace(".", "");
            String email = username + string.split("\\@")[1];
            if (!uniqueEmails.contains(email)) {
                uniqueEmails.add(email);
            }
        }
        return uniqueEmails.size();
    }
}
