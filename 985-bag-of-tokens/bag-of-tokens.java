class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0, j = tokens.length - 1, ans = 0, score = 0;
        while (i <= j) {
            if (tokens[i] <= power) {
                power -= tokens[i++];
                score++;
                ans = Math.max(ans, score);
            } else if (score > 0) {
                power += tokens[j--];
                score--;
            } else break;
        }
        return ans;
    }
}