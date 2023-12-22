class Solution {
    public int maxScore(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = 0;
        for(int c : ch) if(c == '1') right++;
        if(ch[0]  == '0') left++;
        else right--;
        int ans = left+right;
        for(int i = 1; i < ch.length-1; i++) {
            if(ch[i] == '0') left++;
            if(ch[i] == '1') right--;
            ans = Math.max(ans, left+right);
        }
        return ans;
    }
}