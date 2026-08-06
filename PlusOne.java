class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If it is 9, it becomes 0 (carry over the 1 to the next loop iteration)
            digits[i] = 0;
        }
        
        // If the loop finished, it means all digits were 9
        // We need a new array with one extra space for the leading 1
        int[] result = new int[n + 1];
        result[0] = 1;
        
        return result;
    }
}