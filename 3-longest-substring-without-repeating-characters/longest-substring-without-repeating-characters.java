class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] lastIndex = new int[128]; 
        int left = 0; 
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            if (lastIndex[currentChar] > 0) {
                left = Math.max(left, lastIndex[currentChar]);
            }
            lastIndex[currentChar] = right + 1;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}