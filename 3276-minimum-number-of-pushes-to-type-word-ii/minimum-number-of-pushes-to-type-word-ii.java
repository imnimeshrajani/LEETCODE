class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26], ans = 0;
        for(char c : word.toCharArray()) freq[c - 'a']++;
        Arrays.sort(freq);
        for(int i = 0; i < 26; i++) ans += (i / 8 + 1) * freq[26 - i - 1];
        return ans;
    }
}