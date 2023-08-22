class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int big = Integer.MIN_VALUE, sum = 0;
        for (int num : nums) {
            sum += num;
            big = Math.max(sum,big);
            if (num == 0) sum = 0;
        }
        return big;
    }
}