/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution_278 extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            // Safe midpoint calculation to prevent integer overflow
            int mid = left + (right - left) / 2;
            
            if (isBadVersion(mid)) {
                // The first bad version is at mid, or before it
                right = mid;
            } else {
                // The first bad version is strictly after mid
                left = mid + 1;
            }
        }
        
        // left and right converge on the exact first bad version
        return left;
    }
}