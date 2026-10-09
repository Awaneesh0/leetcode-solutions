class Solution {
    public String reverseVowels(String s) {
        // Convert to char array for in-place modification
        char[] chars = s.toCharArray();
        
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            // Advance left pointer until a vowel is found
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            
            // Advance right pointer until a vowel is found
            while (left < right && !isVowel(chars[right])) {
                right--;
            }
            
            // Swap the vowels and move pointers inward
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                
                left++;
                right--;
            }
        }
        
        // Convert back to string
        return new String(chars);
    }
    
    // Helper method for O(1) vowel checking
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}