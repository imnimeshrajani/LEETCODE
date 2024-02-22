class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] freq = new int[n+1];
        int[] believe = new int[n+1];
        for(int i = 0; i < trust.length; i++) {
            freq[trust[i][1]]++;
            believe[trust[i][0]]++;
        }
        for (int i = 1; i < n+1; i++) {
            if(freq[i] == n-1 && believe[i] == 0) return i;
        } 
        return -1;
    }
}