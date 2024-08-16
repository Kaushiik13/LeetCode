import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger r = BigInteger.ZERO;
        for (int i = 0; i < digits.length; i++) {
            r = r.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
        }
        r = r.add(BigInteger.ONE);
        String s = r.toString();
        int len = s.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Character.getNumericValue(s.charAt(i));
        }
        return arr;
    }
}
