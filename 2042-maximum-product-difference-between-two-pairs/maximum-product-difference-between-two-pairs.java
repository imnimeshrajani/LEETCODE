class Solution {
    public int maxProductDifference(int[] nums) {
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE-1, max = 0, secMax = 0;
        for(int i : nums) {
            if(min > i) {
                secMin = min;
                min = i;            
            } else secMin = Math.min(secMin, i);
            if(max < i){
                secMax = max;
                max = i;
            } else secMax = Math.max(secMax, i);
        }
        return (max * secMax) - (min * secMin);
    }
}