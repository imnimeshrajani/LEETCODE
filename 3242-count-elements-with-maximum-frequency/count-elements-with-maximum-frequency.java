class Solution {
    public int maxFrequencyElements(int[] nums) {
        int size = 0, ans = 0, max = 0;
        for (int i : nums) size = Math.max(size, i);
        int[] freq = new int[size+1], arr = new int[size+1];
        for (int i : nums) max = Math.max(max, ++freq[i]);
        for(int i : freq) if(max == i) ans += i; 
        return ans;
    }
}