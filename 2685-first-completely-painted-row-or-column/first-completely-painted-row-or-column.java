class Solution {
        public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m= mat.length;
        int n = mat[0].length;
        HashMap<Integer,int[]> map = new HashMap<>();
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                map.put(mat[i][j],new int[]{i,j});
        int row[] = new int[m];
        int col[] = new int[n];
        for(int i=0;i<arr.length;i++){
            int x[] = map.get(arr[i]);
            row[x[0]]++;
            col[x[1]]++;
            if(row[x[0]]==n || col[x[1]]==m) return i;            
        }
        return -1;
    }
}