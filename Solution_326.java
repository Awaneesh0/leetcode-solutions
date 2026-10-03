class Solution {
    public boolean isPowerOfThree(int n) {
        // Powers of three must be strictly positive.
        // 1162261467 is 3^19, the largest power of 3 that fits in a 32-bit integer.
        return n > 0 && 1162261467 % n == 0;
    }
}