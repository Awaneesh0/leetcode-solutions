class Solution {
    public void moveZeroes(int[] nums) {
        // insertPos points to the index where the next non-zero should go
        int insertPos = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // When we find a non-zero element, swap it into the insertPos
            if (nums[i] != 0) {
                // Swap logic
                int temp = nums[insertPos];
                nums[insertPos] = nums[i];
                nums[i] = temp;
                
                // Move the insert boundary forward
                insertPos++;
            }
        }
    }
}