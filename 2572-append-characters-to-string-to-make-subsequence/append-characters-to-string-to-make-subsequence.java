class Solution {
    public int appendCharacters(String s, String t) {
        if(s.equals(t)) return 0;
        char[] str  = s.toCharArray(), target = t.toCharArray();
        int count = 0;
        for(int i = 0, idx = 0; i < str.length; i++) {
            if(str[i] == target[idx]) {
                idx++;
                count++;
            }
            if(idx == target.length) return 0;
        }
        return target.length - count;
    }
}