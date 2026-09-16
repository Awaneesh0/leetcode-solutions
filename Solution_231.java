class Solution {
    public boolean isPowerOfTwo(int n) {
        // Powers of two must be strictly greater than 0
        if (n <= 0) {
            return false;
        }
        
        // Erase the rightmost 1-bit. 
        // If it was a power of two, the result will be 0.
        return (n & (n - 1)) == 0;
    }
}