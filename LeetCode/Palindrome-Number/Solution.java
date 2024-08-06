import java.util.Scanner;
class Solution {
    public static boolean isPalindrome(int x) {
        String original = Integer.toString(x);
        StringBuilder rev = new StringBuilder(original);
        rev.reverse();
        String reversedString = rev.toString();
        return original.equals(reversedString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean result = isPalindrome(number);
        System.out.println(result ? "True" : "False");
    }
}
