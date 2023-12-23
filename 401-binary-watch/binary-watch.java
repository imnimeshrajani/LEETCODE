class Solution {
    ArrayList<String> times = new ArrayList<>();
    public List<String> readBinaryWatch(int turnedOn) {
        int[] nums = {8, 4, 2, 1, 32, 16, 8, 4, 2, 1};
        bactrack(nums, 0, 0, nums.length - 1, turnedOn, 0);
        return times;
    }

    public void bactrack(int[] nums, int hour, int minute, int pos, int turnedOn, int curOn) {
        if (curOn == turnedOn && hour <= 11 && minute <= 59) {
            StringBuilder b = new StringBuilder();
            b.append(hour).append(":").append(minute < 10 ? "0" : "").append(minute);
            times.add(b.toString());
            return;
        }

        for (int i = pos; i >= 0; i--) {
            if (0 <= i && i <= 3) hour += nums[i];
            else minute += nums[i];

            bactrack(nums, hour, minute, i - 1, turnedOn, curOn + 1);

            if (0 <= i && i <= 3) hour -= nums[i];
            else minute -= nums[i];
        }
    }
}