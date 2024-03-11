class Solution {
    public String customSortString(String order, String s) {
        int[] freq1 = new int[26], freq2 = new int[26];
        StringBuilder ans = new StringBuilder();
        for (char c : order.toCharArray()) freq1[c - 'a']++;
        for (char c : s.toCharArray()) freq2[c - 'a']++;
        for (char c : order.toCharArray()) {
            while (freq2[c - 'a'] > 0) {
                ans.append(c);
                freq2[c - 'a']--;
            }
        }
        for (int i = 0; i < freq2.length; i++) {
            while (i < freq2.length - 1 && freq2[i] == 0) i++;
            while (freq2[i]-- > 0) ans.append((char) (i + 'a'));
        }
        return ans.toString();
    }
}