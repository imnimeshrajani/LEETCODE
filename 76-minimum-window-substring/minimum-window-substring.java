class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        int[] freq = new int[128];
        int count = t.length();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
        for (char c : t.toCharArray()) freq[c]++;

        char[] ch = s.toCharArray();
        while (end < ch.length) {
            if (freq[ch[end++]]-- > 0) count--;

            while (count == 0) {
                if (end - start < minLen) {
                    startIndex = start;
                    minLen = end - start;
                }
                if (freq[ch[start++]]++ == 0) count++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(startIndex, startIndex+minLen);
    }
}