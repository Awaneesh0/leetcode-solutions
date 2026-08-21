import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        // Use long to prevent integer overflow when multiplying large combinations
        long val = 1; 
        
        for (int i = 0; i <= rowIndex; i++) {
            // Add the current combination value to the row
            row.add((int) val);
            
            // Calculate the next value based on the current one
            val = val * (rowIndex - i) / (i + 1);
        }
        
        return row;
    }
}