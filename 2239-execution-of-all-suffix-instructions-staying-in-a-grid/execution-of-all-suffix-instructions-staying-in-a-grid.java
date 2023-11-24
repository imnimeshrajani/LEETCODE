class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int end = n - 1;
        char[] arr = s.toCharArray();
        int[] ans = new int[s.length()];
        if(n == 1) return ans;
        for(int i = 0; i < arr.length; i++) {
            int j = i;
            int tempVertical = startPos[0], tempHorizontal = startPos[1];
            for(; j < arr.length; j++) {
                if(arr[j]  == 'L' && tempHorizontal > 0) tempHorizontal--;
                else if(arr[j]  == 'R' && tempHorizontal < end) tempHorizontal++;
                else if(arr[j]  == 'U' && tempVertical > 0) tempVertical--;
                else if(arr[j]  == 'D' && tempVertical < end) tempVertical++;
                else break;
            }
            ans[i] = j - i;
        }
        return ans;
    }
}