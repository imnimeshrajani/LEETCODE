class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] alphabet = new int[26];
        char[] ch = chars.toCharArray();
        int ans = 0;
        for(int i = 0; i < ch.length; i++)
            alphabet[ch[i] - 'a']++;

        for(String s : words) {
            int[] c = new int[26];
            int i = 0;
            while(i < s.length()) {
                int x = s.charAt(i) - 'a';
                if(++c[x] > alphabet[x]) break;
                i++;
            }
            if(i == s.length()) ans += s.length();
        }
        return ans;
    }
}