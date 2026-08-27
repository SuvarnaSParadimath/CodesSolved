class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int n = s.length();
        int[] count = new int[26];
        
        // Count frequencies of all characters in string s
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        char[] result = new char[n];
        int i = 0;
        
        // Step 1: Match target characters as far as possible
        while (i < n) {
            int targetCharIdx = target.charAt(i) - 'a';
            if (count[targetCharIdx] > 0) {
                result[i] = target.charAt(i);
                count[targetCharIdx]--;
                i++;
            } else {
                break;
            }
        }
        
        // Step 2: Backtrack/branch to ensure the permutation is strictly greater
        while (i >= 0) {
            int limit = (i < n) ? (target.charAt(i) - 'a' + 1) : 26;
            
            // Find the smallest available character strictly greater than target[i]
            int nextCharIdx = -1;
            for (int c = limit; c < 26; c++) {
                if (count[c] > 0) {
                    nextCharIdx = c;
                    break;
                }
            }
            
            // If an alternative character is found, place it and stop backtracking
            if (i < n && nextCharIdx != -1) {
                result[i] = (char) ('a' + nextCharIdx);
                count[nextCharIdx]--;
                i++;
                break;
            }
            
            // If no valid character found, backtrack to the previous index
            i--;
            if (i >= 0) {
                count[result[i] - 'a']++;
            }
        }
        
        // If we backtracked past index 0, no such permutation can be constructed
        if (i < 0) {
            return "";
        }
        
        // Step 3: Greedily fill the remaining positions with the smallest available letters
        while (i < n) {
            for (int c = 0; c < 26; c++) {
                if (count[c] > 0) {
                    result[i] = (char) ('a' + c);
                    count[c]--;
                    break;
                }
            }
            i++;
        }
        
        return new String(result);
    



 
                     
        
        
    }
}