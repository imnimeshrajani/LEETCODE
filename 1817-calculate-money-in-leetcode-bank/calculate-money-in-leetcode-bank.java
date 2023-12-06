class Solution {
    public int totalMoney(int n) {
        if(n <= 7) return n * (n + 1) / 2;
        int e = n % 7;
        n/=7;
        return 28 * n + 7 * (n*(n-1)/2) + n*e + (e*(e+1)/2);
    }
}