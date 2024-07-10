class Solution {
    public int minOperations(String[] logs) {
        int ans = 0;
        for(String log : logs) 
            ans += (log.charAt(1) == '.') ? (ans == 0) ? 0 : -1 : (log.charAt(0) == '.') ? 0 : 1;
        return ans;
    }
}