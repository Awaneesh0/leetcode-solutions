import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // The set represents our sliding window of size k
        Set<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the element is already in the window, we found a match
            if (!window.add(nums[i])) {
                return true;
            }
            
            // If our window exceeds size k, remove the oldest element
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}