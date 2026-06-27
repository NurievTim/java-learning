package practice_12;

public class DebugTask4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }
    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("В метод нельзя передать null");
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
