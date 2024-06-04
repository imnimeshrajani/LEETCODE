class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        int isOdd = 0, freq[] = new int[128];
        for(char i : s.toCharArray()) freq[i]++;
        for(int i : freq) isOdd += i & 1;
        return s.length() - isOdd + (isOdd > 0 ? 1 : 0);
    }
}