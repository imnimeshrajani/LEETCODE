class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        for (int i = 1; i <= n; i++) 
            if(total - (i * (i + 1) / 2) + i == (i * (i + 1) / 2)) return i;
        return -1;
    }
}