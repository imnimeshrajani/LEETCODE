class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        boolean[] used = new boolean[1001];
        for (int i : arr) freq[1000 + i]++;
        for (int i : arr) {
            int count = freq[1000 + i];
            freq[1000 + i] = 0;
            if (count > 0) {
                if (used[count]) return false;
                used[count] = true;
            }
        }
        return true;
    }
}