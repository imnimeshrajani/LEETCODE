class Solution {
    public int minChanges(String s) {
        int ans = 0;
        char[] ch = s.toCharArray();
        for(int i = 1; i < ch.length; i += 2) {
            ans += ch[i - 1] + ch[i] - 2 & 1;
        }
        return ans;
    }
}