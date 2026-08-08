class Sqrt {
    public int mySqrt(int x) {
        // Handle base cases for 0 and 1
        if (x == 0 || x == 1) {
            return x;
        }
        
        int left = 1;
        int right = x;
        int result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if mid squared is less than or equal to x
            // We use division (mid <= x / mid) to prevent integer overflow
            if (mid <= x / mid) {
                result = mid;       // Record the valid candidate
                left = mid + 1;     // Try to find a larger one
            } else {
                right = mid - 1;    // mid is too large, search the lower half
            }
        }
        
        return result;
    }
}