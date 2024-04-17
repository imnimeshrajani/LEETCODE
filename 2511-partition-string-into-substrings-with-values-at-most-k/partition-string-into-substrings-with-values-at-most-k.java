class Solution {
    public int minimumPartition(String s, int k) {
        int ans = 0, left = 0, right = 0;
        while(right < s.length()) {
            while(right < s.length() && Long.parseLong(s.substring(left,right + 1)) <= k) right++;
            ans++;
            if(left == right) return -1;
            left = right;
        }
        return ans;
    }
}