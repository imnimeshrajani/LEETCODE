class Solution {
    public int scoreOfString(String s) {
        int ans = 0, prev = 0;
        for(char c : s.toCharArray()) {
            if(prev == 0) prev = c;
            else {
                ans += Math.abs(prev - c);
                prev = c;
            }
        }
        return ans;
    }
}