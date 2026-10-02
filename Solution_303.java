class NumArray {
    // Array to store the running totals
    private int[] prefixSums;

    public NumArray(int[] nums) {
        // Size + 1 handles queries where left == 0 without requiring extra if-statements
        prefixSums = new int[nums.length + 1];
        
        // Calculate the cumulative sum at each step
        for (int i = 0; i < nums.length; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        // Total sum up to 'right' minus the sum of elements before 'left'
        return prefixSums[right + 1] - prefixSums[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */