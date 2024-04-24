class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1, small = numbers[left], big = numbers[right];
        while (small + big != target) {
            if(small + big > target) big = numbers[--right];
            else if(small + big < target) small = numbers[++left];
        }
        return new int[]{++left, ++right};
    }
}