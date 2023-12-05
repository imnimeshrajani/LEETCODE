class Solution {
    public long countVowels(String word) {
        byte[] ch = word.getBytes();
        long ans = 0, count = 0;
        int n = ch.length;
        for(int  i = n - 1; i >= 0; i--){
            ans += count;
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                ans += n - i;
                count += n -i;
            }
        }       
        return ans;
    }
}