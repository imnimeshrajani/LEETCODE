class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        for(int i = temp.length - 1, hottest = 0; i >= 0; i--) {
            if (temp[i] >= hottest) {
                hottest = temp[i];
                continue;
            }
            int days = 1;
            while (temp[i + days] <= temp[i]) days += ans[i + days];
            ans[i] = days;
        }
        return ans;
    }
}