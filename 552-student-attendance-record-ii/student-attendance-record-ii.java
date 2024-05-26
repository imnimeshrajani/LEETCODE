// class Solution {
//     int mod = 1000000007;
//     public int checkRecord(int n) {
//         int[][] dp = new int[2][3];
//         for(int[] arr : dp) Arrays.fill(arr, 1);
//         for(int i = 1; i <= n; i++) {
//             int[][] arr = new int[2][3];
//             for(int a = 0; a < 2; a++) {
//                 for(int l = 0; l < 3; l++) {
//                     arr[a][l] += dp[a][2];
//                     arr[a][l] %= mod;
//                     if(a > 0) {
//                         arr[a][l] += dp[a - 1][2];
//                         arr[a][l] %= mod;
//                     }
//                     if(l > 0) { 
//                         arr[a][l] += dp[a][l - 1];
//                         arr[a][l] %= mod;
//                     }
//                 }
//             }
//             dp = arr;
//         }
//         return dp[1][2];
//     }

// }

class Solution {
    static final int M = 1000000007;

    public int checkRecord(int n) {
        long[] PorL = new long[n + 1]; // ending with P or L, no A
        long[] P = new long[n + 1]; // ending with P, no A
        PorL[0] = P[0] = 1; PorL[1] = 2; P[1] = 1;

        for (int i = 2; i <= n; i++) {
            P[i] = PorL[i - 1];
            PorL[i] = (P[i] + P[i - 1] + P[i - 2]) % M;
        }
    
        long res = PorL[n];
        for (int i = 0; i < n; i++) { // inserting A into (n-1)-length strings
    	    long s = (PorL[i] * PorL[n - i - 1]) % M;
            res = (res + s) % M;
        }
    
        return (int) res;
    }
}