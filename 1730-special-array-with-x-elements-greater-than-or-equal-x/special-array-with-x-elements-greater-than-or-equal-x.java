class Solution {
    public int specialArray(int[] nums) {
        int ans = 0, n = nums.length, arr[] = new int[n+1];
        for(int i : nums) 
            if(i >= n) arr[n]++;
            else arr[i]++;
        for(int i = n; i > 0; i--) {
            ans += arr[i];
            if(ans  == i)  return i;
        }
        return -1;
    }
}