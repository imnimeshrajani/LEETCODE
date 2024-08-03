class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] freq = new int[1001];
        for(int i : arr) freq[i]++;
        for(int i : target) if(freq[i] == 0) return false; else freq[i]--;
        return true;
    }
}