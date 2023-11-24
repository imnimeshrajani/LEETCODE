class Solution {
    public int secondsToRemoveOccurrences(String s) {
         int count_one = 0;
        int wait_time = 0;
        int answer = 0;
        int pre_bit = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr_bit = s.charAt(i) - '0';
            if (curr_bit == 1) {
                int dist = i - count_one;
                count_one++;
                if (dist == 0) continue;
                int step = dist + wait_time;
                answer = Math.max(answer, step);
                wait_time++;
            } else {
                if (wait_time > 0) wait_time--;
            }
            pre_bit = curr_bit;
        }
        return answer;
    }
}