class Solution {
    public int climbStairs(int n) { return (n==1 || n==2 || n==3) ? n : fibo(n, 2,3); }
    int fibo(int n, int i, int j) { return n == 4 ? i + j : fibo(n-1, j, i+j); }
}