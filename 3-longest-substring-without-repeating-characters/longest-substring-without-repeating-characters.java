class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        int n = c.length, i = 0, j = 0, ans = 0;
        int[] arr = new int[128];
        while (i < n) {
            j = Math.max(j, arr[c[i]]);
            ans = Math.max(ans, i - j + 1);
            arr[c[i]] = ++i;
        }
        return ans;
    }
}