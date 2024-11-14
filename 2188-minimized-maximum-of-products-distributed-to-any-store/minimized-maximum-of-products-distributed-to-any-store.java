class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int start = 1, end = 100000, ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(isPossible(mid, quantities, n)) {
                end = --mid;
            } else start = ++mid;
        }
        return start;
    }

    boolean isPossible(int div, int[] arr, int n) {
        for(int val : arr) {
            n -= (val / div);
            if(val % div != 0) n--;
            if(n < 0) return false;
        }
        return true;
    }
}