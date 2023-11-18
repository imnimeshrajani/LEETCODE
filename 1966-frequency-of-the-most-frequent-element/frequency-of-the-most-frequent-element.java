class Solution {
    public int maxFrequency(int[] nums, int k) {
        if(nums.length == 1) return 1;
        countingSort(nums);
        int i = 0, j = 1, prifix = 0;
        int freq = 1;
        while(i<j) {
            prifix += nums[j-1];
            if((nums[j]*(j-i)) - prifix <= k){
                freq = Math.max(freq, j-i+1);
            } else if(j != nums.length-1) {
                prifix -= nums[i];
                i++;
            } else break;
            if(j<nums.length-1) j++;
            else break;
        }
        return freq;
    }

    private void countingSort(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num: nums) {
            max = Math.max(max, num);
        }
        int[] map = new int[max + 1];
        for(int num: nums) {
            map[num]++;
        }
        int i = 0;
        int j = 0;
        while(i <= max) {
            if (map[i]-- > 0) {
                nums[j++] = i;
            } else {
                i++;
            }
        }        
    }
}