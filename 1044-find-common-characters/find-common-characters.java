class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        int[] freq = getFrequency(words[0]);
        for(int i = 1; i < words.length; i++) {
            int[] currFreq = getFrequency(words[i]);
            for(int j = 0; j < 26; j++) 
                freq[j] = Math.min(freq[j], currFreq[j]);
        }
        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                String s = String.valueOf((char) (i + 'a'));
                while(freq[i]-- > 0)
                    ans.add(s);
            }
        }
        return ans;
    }
    int[] getFrequency(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()) freq[c - 'a']++;
        return freq;
    } 
}