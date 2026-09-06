public class Solution_191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        
        while (n != 0) {
            // Erase the rightmost '1' bit
            n &= (n - 1);
            
            // Increment the counter for the erased bit
            count++;
        }
        
        return count;
    }
}