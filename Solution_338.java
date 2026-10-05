class Solution {
    public int[] countBits(int n) {
        // Create an array to store the results up to n
        int[] dp = new int[n + 1];
        
        // Base case is implicitly dp[0] = 0
        
        for (int i = 1; i <= n; i++) {
            // dp[i >> 1] gets the 1s count of the number shifted right
            // (i & 1) adds 1 if the current number is odd, or 0 if it's even
            dp[i] = dp[i >> 1] + (i & 1);
        }
        
        return dp;
    }
}