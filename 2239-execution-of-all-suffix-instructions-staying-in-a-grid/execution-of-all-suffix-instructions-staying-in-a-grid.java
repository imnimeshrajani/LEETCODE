class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int L = -1, R = 1, U = -1, D = 1, end = n - 1;
        char[] arr = s.toCharArray();
        int[] ans = new int[s.length()];
        if(n == 1) return ans;
        for(int i =0; i < arr.length; i++) {
            int j = i;
            int[] tempStart = new int[2];
            tempStart[0] = startPos[0];
            tempStart[1] = startPos[1];
            for(; j < arr.length; j++) {
                if(arr[j]  == 'L' && tempStart[1] > 0)  tempStart[1]--;
                else if(arr[j]  == 'R' && tempStart[1] < end) tempStart[1]++;
                else if(arr[j]  == 'U' && tempStart[0] > 0) tempStart[0]--;
                else if(arr[j]  == 'D' && tempStart[0] < end) tempStart[0]++;
                else break;
            }
            ans[i] = j - i;
        }
        return ans;
    }
}