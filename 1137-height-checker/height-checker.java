class Solution {
    public int heightChecker(int[] heights) {
        int arr[] = new int[101], ans = 0, idx = 0;
        for(int i : heights) arr[i]++;
        for(int i = 0; i < heights.length; i++) {
            while(arr[idx] == 0) idx++;
            if(idx != heights[i]) ans++;
            arr[idx]--;
        }
        return ans;
    }
}