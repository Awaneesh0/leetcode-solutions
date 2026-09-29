import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        // If lengths do not match, a bijection is impossible
        if (pattern.length() != words.length) {
            return false;
        }
        
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> mappedWords = new HashSet<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            // If the character is already mapped, verify it maps to the same word
            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            } else {
                // If the character is new, the word must also be unmapped
                if (mappedWords.contains(word)) {
                    return false; 
                }
                map.put(c, word);
                mappedWords.add(word);
            }
        }
        
        return true;
    }
}