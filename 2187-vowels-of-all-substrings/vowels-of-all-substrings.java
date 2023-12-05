class Solution {
    public long countVowels(String word) {
        byte[] ch = word.getBytes();
        long ans = 0, n = ch.length;
        for(int i = 0; i < n; i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                ans += (i + 1) * (n - i);
            }
        }       
        return ans;
    }
}