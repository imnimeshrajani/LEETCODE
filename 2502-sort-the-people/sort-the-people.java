class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, idx = 0;
        for(int val : heights) {
            min = Math.min(min, val);
            max = Math.max(max, val);
        }
        int[] freq = new int[(max - min) + 1];
        Arrays.fill(freq, -1);
        for(int i = 0; i < heights.length; i++) 
            freq[heights[i] - min] = i;
            
        String[] ans = new String[names.length];
        for(int i = freq.length - 1; i >= 0; i--) 
            if(freq[i] > -1) 
                ans[idx++] = names[freq[i]];
            
        return ans;
    }
}