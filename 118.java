import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        // Base case: if 0 rows are requested, return an empty list
        if (numRows == 0) {
            return triangle;
        }
        
        // The first row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        // Start building from the second row (index 1)
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            
            // The first element of every row is always 1
            currentRow.add(1);
            
            // Calculate the inner elements based on the previous row
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // The last element of every row is always 1
            currentRow.add(1);
            
            // Add the newly constructed row to the triangle
            triangle.add(currentRow);
        }
        
        return triangle;
    }
}