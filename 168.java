class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();
        
        while (columnNumber > 0) {
            // Subtract 1 to make the system 0-indexed (0 to 25)
            columnNumber--;
            
            // Calculate the remainder (0 corresponds to 'A', 25 to 'Z')
            int remainder = columnNumber % 26;
            
            // Convert the integer to its corresponding character
            title.append((char) (remainder + 'A'));
            
            // Move to the next base-26 digit
            columnNumber /= 26;
        }
        
        // Reverse the string since we built it from right to left
        return title.reverse().toString();
    }
}