public class Main {
    public static String longestPalindromeSubstring(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        String res = "";
        int n = s.length();

        /** change all input to lowercase to handle Lowercase and Uppercase. Point no. 3 **/
        s = s.toLowerCase();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub) && (res.length() == 0 || sub.length() > res.length())) {
                    res = sub;
                }
            }
        }
        return res.toLowerCase();
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "babad";
        String result = longestPalindromeSubstring(input);
        System.out.println(result);
    }
}