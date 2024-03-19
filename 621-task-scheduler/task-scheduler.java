class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26], extra = 0, max = 0;
        for (char i : tasks) {
            freq[i - 'A']++;
            int prevMax = max;
            max = Math.max(freq[i - 'A'],max);
        }
        for (int i : freq) if (i == max) extra++;
        return Math.max(tasks.length, (--max * ++n) + extra);
    }
}