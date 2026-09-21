class Solution {
    public int addDigits(int num) {
        // Edge case: 0 is the only number that results in 0
        if (num == 0) {
            return 0;
        }
        
        // Calculate the digital root in strictly constant time
        return 1 + (num - 1) % 9;
    }
}