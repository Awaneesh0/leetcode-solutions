class Solution {
    public boolean isIsomorphic(String s, String t) {
        // If the lengths are different, they cannot be isomorphic
        if (s.length() != t.length()) {
            return false;
        }
        
        // Arrays to store the last seen positions of characters (ASCII size)
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // If the characters were last seen at different positions, mapping fails
            if (mapS[charS] != mapT[charT]) {
                return false;
            }
            
            // Record the current position. 
            // We use i + 1 to avoid confusion with the default array value of 0.
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }
        
        return true;
    }
}