class Solution {
    public int missingNumber(int[] nums) {
        // Initialize with n to account for the loop only going up to n - 1
        int missing = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            // XOR the index and the value
            missing ^= i ^ nums[i];
        }
        
        return missing;
    }
}