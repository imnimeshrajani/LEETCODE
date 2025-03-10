class Solution {
    public long countOfSubstrings(String word, int k) {
        int[][] freq = new int[2][26];
        freq[0]['a' - 'a'] = 1;
        freq[0]['e' - 'a'] = 1;
        freq[0]['i' - 'a'] = 1;
        freq[0]['o' - 'a'] = 1;
        freq[0]['u' - 'a'] = 1;

        long response = 0;
        int currentK = 0, vowels = 0, extraLeft = 0;

        for (int right = 0, left = 0; right < word.length(); right++) {
            char rightChar = word.charAt(right);

            if (freq[0][rightChar - 'a'] == 1) {
                if (++freq[1][rightChar - 'a'] == 1) vowels++;
            } else currentK++;
            

            while (currentK > k) {
                char leftChar = word.charAt(left);
                if (freq[0][leftChar - 'a'] == 1) {
                    if (--freq[1][leftChar - 'a'] == 0) vowels--;
                } else currentK--;
                left++;
                extraLeft = 0;
            }

            while (vowels == 5 && currentK == k && left < right && freq[0][word.charAt(left) - 'a'] == 1 && freq[1][word.charAt(left) - 'a'] > 1) {
                extraLeft++;
                freq[1][word.charAt(left++) - 'a']--;
            }

            if (currentK == k && vowels == 5) 
                response += (1 + extraLeft);
        }

        return response;
    }
}