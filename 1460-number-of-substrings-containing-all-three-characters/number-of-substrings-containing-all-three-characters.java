class Solution {
    public int numberOfSubstrings(String s) {
        int[] track = new int[3];
        int ans = 0, start = 0;
        for(int i = 0; i < s.length(); i++) {
            track[s.charAt(i) - 'a']++;
            while (track[0] > 0 && track[1] > 0 && track[2] > 0) {
                ans += s.length() - i;
                track[s.charAt(start++) - 'a']--;
            }
        }
        return ans;
    }
}