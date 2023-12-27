class Solution {
    public int minCost(String colors, int[] A) {
        char[] ch = colors.toCharArray();
        int ans = 0;
        for(int i = 1; i < ch.length; i++) {
            if(ch[i] == ch[i-1]) {
                ans += Math.min(A[i], A[i-1]);
                A[i] = Math.max(A[i], A[i-1]);
            }
        }
        return ans;
    }
}