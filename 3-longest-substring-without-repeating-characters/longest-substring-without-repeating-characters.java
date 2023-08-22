class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int i = 0, big = Integer.MIN_VALUE;
        StringBuilder str = new StringBuilder(String.valueOf(s.charAt(0)));
        while (i<s.length()){
            if (!str.toString().contains(String.valueOf(s.charAt(i)))) {
                str.append(s.charAt(i));
                i++;
            } else str.deleteCharAt(0);
            if (big<str.length()) big = str.length();
        }
        return big;
    }
}