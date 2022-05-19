package String.problems;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(Palindrome.checkPalindrome("DAD"));

    }
    public static boolean checkPalindrome(String word) {
        boolean result = false;
        int n = word.length();
        word = word.toLowerCase();
        for (int i = 0; i < n; i++, n--) {
            if (word.charAt(i) != word.charAt(n - 1)) {
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }

}







