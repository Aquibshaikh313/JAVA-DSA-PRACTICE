//Leetcode problem 9 -->

class Solution {
    public boolean isPalindrome(int x) {
        // negative numbers are not palindrome
        if (x < 0) return false;

        int original = x;
        long reversed = 0; // use long to avoid overflow

        while (x != 0) {
            int digit = x % 10;        // take last digit
            reversed = reversed * 10 + digit; 
            x /= 10;                   // remove last digit
        }

        return original == reversed;
    }
}
