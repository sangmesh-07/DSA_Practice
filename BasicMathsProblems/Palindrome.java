
public class Palindrome {

    public boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return original == rev;
    }

    public static void main(String[] args) {
        int n = 121;
        Palindrome sol = new Palindrome();
        boolean result = sol.isPalindrome(n);
        if (result) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }
    }
}
