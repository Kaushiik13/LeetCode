class Solution {
   
 public int reverse(int x) {
        int reversed = 0;
        int INT_MAX = Integer.MAX_VALUE;  // 2^31 - 1
        int INT_MIN = Integer.MIN_VALUE;  // -2^31
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            // Check for overflow before updating reversed
            if (reversed > INT_MAX / 10 || (reversed == INT_MAX / 10 && digit > 7)) return 0;
            if (reversed < INT_MIN / 10 || (reversed == INT_MIN / 10 && digit < -8)) return 0;
            
            reversed = reversed * 10 + digit;
        }
        
        return reversed;
    }
}
