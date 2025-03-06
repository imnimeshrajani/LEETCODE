class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length, ans[] = new int[2];
        boolean[] freq = new boolean[(n * n) + 1];
        for(int[] col : grid) {
            for(int i : col) {
                if(freq[i]) ans[0] = i;
                freq[i] = true;
            }
        }
        
        for(int i = 1; i < freq.length; i++) {
            if(!freq[i]) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}