class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            ans += helper(ch, i,i);
            ans += helper(ch, i-1,i);
        }
        return ans;
    }
    public int helper(char[] ch, int left, int right) {
        int count = 0;
        while(left >=0 && right < ch.length && ch[left] == ch[right]) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}