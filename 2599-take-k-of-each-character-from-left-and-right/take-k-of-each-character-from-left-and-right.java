class Solution {
    public int takeCharacters(String s, int k) {
        int[] abc = new int[3];
        for(char ch : s.toCharArray()) abc[ch - 'a']++;
        if(abc[0] < k || abc[1] < k || abc[2] < k) return -1;
        int ans = abc[0] + abc[1] + abc[2], idx = 0;
        
        for(char ch : s.toCharArray()) {
            abc[ch - 'a']--;
            if(abc[0] < k || abc[1] < k || abc[2] < k) {
                ans = Math.min(abc[0] + abc[1] + abc[2] + 1, ans);
                while(s.charAt(idx) != ch) abc[s.charAt(idx++) - 'a']++;
                abc[ch - 'a']++;
                idx++;
            }
        }
        return Math.min(abc[0] + abc[1] + abc[2], ans);
    }
}