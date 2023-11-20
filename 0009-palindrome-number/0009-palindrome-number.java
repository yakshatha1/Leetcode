class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int originalNumber = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
 return originalNumber == reversed;
    }}