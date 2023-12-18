class Solution {
    private int pos = 0;
    public String decodeString(String s) {
        char[] ch = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        String num = "";
        for (int i = pos; i < s.length(); i++) {
            if (ch[i] != '[' && ch[i] != ']' && !Character.isDigit(ch[i])) {
                ans.append(ch[i]);
            } else if (Character.isDigit(ch[i])) {
                num += ch[i];
            } else if (ch[i] == '[') {
                pos = i + 1;
                String next = decodeString(s);
                for (int n = Integer.valueOf(num); n > 0; n--) ans.append(next);
                num = "";
                i = pos;
            } else if (ch[i] == ']') {
                pos = i;
                return ans.toString();
            }
        }
        return ans.toString();
    }
}