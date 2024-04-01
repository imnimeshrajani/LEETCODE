class Solution {
    public long countSubstrings(String s, char c) {
        long ans = 0, count = 0;
        for (char ch : s.toCharArray()) 
            if(c == ch) 
                ans += ++count;
        return ans;
    }
}
// 1 2 3 4 5 6 7