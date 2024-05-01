class Solution {
    public int longestStrChain(String[] words) {
        int n = words.length, dp[] = new int [n+1], ans = 1;
        Arrays.sort(words,(a, b) -> Integer.compare(a.length(), b.length()));
        Arrays.fill(dp,1);
        for(int i = 1;i < n; i++){
            for(int j = i-1;j >= 0; j--){
                if(isPossible(words,i,j)){
                    dp[i] = Math.max(1+dp[j],dp[i]);
                    ans = Math.max(ans,dp[i]);
                }
            }
        }
        return ans;
    }
    public boolean isPossible(String[] words,int i,int j){
        char[] s = words[i].toCharArray(), p = words[j].toCharArray();
        if(s.length - p.length == 1){
            boolean bool = false;
            for(int first = 0,second = 0;first < s.length && second < p.length; first++,second++){
                if(s[first] != p[second]){
                    if(bool) return false;
                    bool = true;
                    second--;
                }
            }
            return true;
        }
        return false;
    }
}