class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), j = 0, maxLength = 0;
        char[] c = s.toCharArray();
        int[] lastIndex = new int[128];
        for (int i = 0; i < n; i++) {
            char ch = c[i];
            if (lastIndex[ch] > 0) {
                j = Math.max(j, lastIndex[ch]);
            }
            lastIndex[ch] = i + 1;
            maxLength = Math.max(maxLength, i - j + 1);
        }
        return maxLength;
    }
}