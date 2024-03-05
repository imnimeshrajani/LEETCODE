class Solution {
    public int minimumLength(String s) {
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length - 1;
        while(i < j) {
            if(ch[i] != ch[j]) break;
            char c = ch[i];
            while(i <= j && ch[i] == c) i++;
            while(i <= j && ch[j] == c) j--;
        }
        return j - i + 1;
    }
}