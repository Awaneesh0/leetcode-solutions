import java.util.HashSet;

class Solution_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Step 1: Add all elements of nums1 to a HashSet to remove duplicates
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Step 2: Check elements of nums2 against set1
        HashSet<Integer> intersect = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersect.add(num);
            }
        }
        
        // Step 3: Convert the intersection set back to a primitive int array
        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            result[i++] = num;
        }
        
        return result;
    }
}