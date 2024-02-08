public class Solution {
    public int numSquares(int n) {
        int[] freq = new int[++n];
        Arrays.fill(freq, Integer.MAX_VALUE);
        freq[0] = 0;
        for(int i = 0; i < n; i++) 
            for(int j = 1; i + (j * j) < n; j++) 
                freq[i + (j * j)] = Math.min(freq[i + (j * j)], freq[i]+1);
        return freq[--n];
    }
}