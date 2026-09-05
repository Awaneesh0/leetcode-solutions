public class Solution_190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            // Shift result left by 1 to make space for the new bit
            result <<= 1;
            
            // Extract the rightmost bit from n and add it to result
            result |= (n & 1);
            
            // Unsigned shift n right by 1 to process the next bit
            n >>>= 1;
        }
        
        return result;
    }
}