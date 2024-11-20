class Solution {
    public int takeCharacters(String s, int k) {
        int[] abc = new int[3];
        char[] arr = s.toCharArray();
        for(char ch : arr) abc[ch - 'a']++;
        if(abc[0] < k || abc[1] < k || abc[2] < k) return -1;
        int ans = abc[0] + abc[1] + abc[2], idx = 0;

        for(char ch : arr) {
            abc[ch - 'a']--;
            if(abc[0] < k || abc[1] < k || abc[2] < k) {
                ans = Math.min(abc[0] + abc[1] + abc[2] + 1, ans);
                while(arr[idx] != ch) abc[arr[idx++] - 'a']++;
                abc[ch - 'a']++;
                idx++;
            }
        }
        return Math.min(abc[0] + abc[1] + abc[2], ans);
    }
}