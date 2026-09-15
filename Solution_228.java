import java.util.ArrayList;
import java.util.List;

class Solution_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Mark the start of the current range
            int start = nums[i];
            
            // Keep moving forward as long as the next number is consecutive
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            
            // i is now at the end of the consecutive sequence.
            // Format the string based on whether it's a range or a single number.
            if (start != nums[i]) {
                ranges.add(start + "->" + nums[i]);
            } else {
                ranges.add(String.valueOf(start));
            }
        }
        
        return ranges;
    }
}