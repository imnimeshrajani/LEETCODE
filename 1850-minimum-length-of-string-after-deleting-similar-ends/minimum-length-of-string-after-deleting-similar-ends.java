class Solution {
    public int minimumLength(String s) {
        char[] ch = s.toCharArray();
        int start = 0, end = ch.length - 1;
        while(start < end) {
            if(ch[start] != ch[end]) break;
            while(start < end && ch[start] == ch[start+1]) start++;
            if(start == end) return 0;
            while(start < end && ch[end] == ch[end-1]) end--;
            if(start == end) return 0;
            start++;
            end--;
        }
        return end - start + 1;
    }
}