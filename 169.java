class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        
        for (int num : nums) {
            // If the count drops to zero, we elect a new candidate
            if (count == 0) {
                candidate = num;
            }
            
            // If the current number is our candidate, increase the count
            // Otherwise, decrease the count
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}