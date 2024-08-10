import java.util.Scanner;
class Solution {
    public static boolean isPalindrome(int x) {
        String original = Integer.toString(x);
        StringBuilder rev = new StringBuilder(original);
        rev.reverse();
        String reversedString = rev.toString();
        return original.equals(reversedString);
    }
}
