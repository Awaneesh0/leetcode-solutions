class Solution_202 {
    public boolean isHappy(int n) {
        // Initialize slow and fast pointers
        int slow = n;
        int fast = getNext(n);
        
        // Loop until fast reaches 1 (happy) or fast catches up to slow (cycle)
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);                // Move 1 step
            fast = getNext(getNext(fast));       // Move 2 steps
        }
        
        // If fast hit 1, it's a happy number. Otherwise, it's a cycle.
        return fast == 1;
    }
    
    // Helper method to calculate the sum of the squares of the digits
    private int getNext(int n) {
        int totalSum = 0;
        
        while (n > 0) {
            int digit = n % 10;
            totalSum += digit * digit;
            n /= 10;
        }
        
        return totalSum;
    }
}