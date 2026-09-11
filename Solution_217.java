import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique elements
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // set.add() returns false if the element already exists in the set
            if (!seen.add(num)) {
                return true;
            }
        }
        
        // If we reach the end, all elements are unique
        return false;
    }
}