class Haystack {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        
        // If needle is longer than haystack, it can't be inside it
        if (hLen < nLen) {
            return -1;
        }
        
        // Only need to loop up to the point where the needle can still fit
        for (int i = 0; i <= hLen - nLen; i++) {
            int j = 0;
            
            // Check characters one by one
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            
            // If j reached the length of the needle, we found a full match
            if (j == nLen) {
                return i;
            }
        }
        
        // If the loop finishes without returning, the needle is not in the haystack
        return -1;
    }
}