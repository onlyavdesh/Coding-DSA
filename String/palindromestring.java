package String;

public class palindromestring{

    public static boolean ispalind(String s) {
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "AmAmAmAmA";  // removed space

        if (ispalind(str)) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not Palindrome ❌");
        }
    }
}
