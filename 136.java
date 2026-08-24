class Solution {
    public int singleNumber(int[] nums) {
        // Initialize the result to 0
        int result = 0;
        
        // XOR all elements in the array
        for (int num : nums) {
            result ^= num;
        }
        
        // The duplicate numbers will cancel out, leaving the single number
        return result;
    }
}