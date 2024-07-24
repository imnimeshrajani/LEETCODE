class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[][] list = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++) {
            int val = nums[i], number = (val == 0) ? mapping[0] : 0, placeVal = 1;
            while(val > 0) {
                number += placeVal * mapping[val % 10];
                placeVal *= 10;
                val /= 10;
            }
            list[i] = new int[] {number, i};
        }
        Arrays.sort(list, (a, b) -> (a[0] != b[0]) ? a[0] - b[0] : a[1] - b[1]);
        int[] ans = new int[nums.length];
        for(int i = 0; i < list.length; i++) {
            // System.out.println(Arrays.toString(list.get(i)));
            ans[i] = nums[list[i][1]];
        }
        return ans;
    }
}