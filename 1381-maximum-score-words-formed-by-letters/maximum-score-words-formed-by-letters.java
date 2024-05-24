class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] ch = new int[score.length];
        for(char c : letters) ch[c - 'a']++;
        return helper(words, ch, score, 0);
    }
    int helper(String[] words, int[] ch, int[] score, int idx) {
        int max = 0;
        for(int i = idx; i < words.length; i++) {
            int sum = 0;
            boolean isValid = true;
            for(char c : words[i].toCharArray()) {
                ch[c - 'a']--;
                sum += score[c - 'a'];
                if(ch[c - 'a'] < 0) isValid = false;
            } 
            if(isValid) {
                sum += helper(words, ch, score, i + 1);
                max = Math.max(max, sum);
            }
            for(char c : words[i].toCharArray()) 
                ch[c - 'a']++;
        }
        return max;
    }
}