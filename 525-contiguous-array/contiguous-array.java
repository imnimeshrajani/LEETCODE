class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, max = 0, i = 0;
        map.put(0, -1);
        while (i < nums.length) {
            if (nums[i] == 0)
                count++;
            else
                count--;

            if (map.containsKey(count))
                max = Math.max(max, i - map.get(count));
            else
                map.put(count, i);

            i++;
        }
        return max;
    }
}