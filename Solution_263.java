class Solution {
    public boolean isUgly(int n) {
        // Ugly numbers must be strictly positive integers
        if (n <= 0) {
            return false;
        }
        
        // The allowed prime factors
        int[] allowedPrimes = {2, 3, 5};
        
        // Repeatedly divide n by 2, 3, and 5
        for (int factor : allowedPrimes) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        
        // If the remaining number is 1, it had no other prime factors
        return n == 1;
    }
}