class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int ans = -1;
        for (int num : nums) {
            int sum = 0, val = num;
            while (val > 0) {
                sum += val % 10;
                val = val / 10;
            }
            int[] arr = map.computeIfAbsent(sum, k -> new int[2]);
            if (arr[0] == 0 && arr[1] == 0)
                arr[1] = num;
            else {
                if (arr[1] < num) {
                    arr[0] = arr[1];
                    arr[1] = num;
                } else if (arr[0] < num)
                    arr[0] = num;

            }
        }
        for (int[] val : map.values()) {
            // System.out.println("0 : " + val[0] + ", 1: " + val[1]);
            if (val[0] == 0 || val[1] == 0)
                continue;
            ans = Math.max(ans, val[0] + val[1]);
        }

        return ans;
    }
}