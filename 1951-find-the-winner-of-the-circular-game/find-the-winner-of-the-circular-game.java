class Solution {
    public int findTheWinner(int n, int k) {
        return solve(n, k) + 1;
    }
    public int solve(int n,int k) {
        return n == 1 ? 0 : (solve(n - 1, k) + k) % n;
    }
}