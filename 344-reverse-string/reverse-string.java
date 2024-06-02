class Solution {
    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        while(start < end) {
            s[start] ^= s[end];
            s[end] ^= s[start];
            s[start++] ^= s[end--];
        }
    }
}