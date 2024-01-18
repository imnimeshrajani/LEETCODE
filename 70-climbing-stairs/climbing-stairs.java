class Solution {
    public int climbStairs(int n) { 
        int a = 1, b = 1, i = 1;
        while(i++ != n){
            a += b;
            a ^= b;
            b ^= a;
            a ^= b;
        }
        return b;
    }
}