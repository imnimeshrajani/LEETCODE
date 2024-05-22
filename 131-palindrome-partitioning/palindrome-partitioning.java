class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j <= i; j++)
                if(arr[i] == arr[j] && (i-j <= 2 || dp[j + 1][i - 1]))
                    dp[j][i] = true;
        helper(arr, new ArrayList<>(), 0, dp);
        return ans;
    }
    void helper(char[] arr, List<String> str, int idx, boolean[][] dp) {
        if(idx == arr.length) {
            ans.add(new ArrayList(str));
            return;
        }
        for(int i = idx; i < arr.length; i++) {
            if(dp[idx][i]) {
                str.add(new String(arr, idx, i+1 - idx));
                helper(arr, str, i + 1, dp);
                str.remove(str.size() - 1);
            }
        }
    }
}