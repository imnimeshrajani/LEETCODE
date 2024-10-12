class Solution {
    public int minGroups(int[][] intervals) {
        int n = intervals.length;
        int[] begin = new int[n], end = new int[n];
        for (int i = 0; i < n; i++) {
            begin[i] = intervals[i][0];
              end[i] = intervals[i][1];
        }
        
        Arrays.sort(begin);
        Arrays.sort(end);
        
        int res = 0;
        for (int i = 0, j = 0; i < n; i++) {
            if (begin[i] <= end[j]) res++; 
            else j++; 
        }
        
        return res;
    }
}