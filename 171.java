class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        
        for (int i = 0; i < columnTitle.length(); i++) {
            // Extract the current character
            char c = columnTitle.charAt(i);
            
            // Map the character to a 1-26 range
            int value = c - 'A' + 1;
            
            // Shift existing result by base 26 and add the new value
            result = result * 26 + value;
        }
        
        return result;
    }
}