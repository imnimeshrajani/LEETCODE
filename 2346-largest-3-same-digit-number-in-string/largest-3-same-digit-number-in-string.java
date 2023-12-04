class Solution {
    public String largestGoodInteger(String num) {
        int result = -1;
        char[] ch = num.toCharArray();
        for (int i = 0; i + 2 < ch.length; i++) {
            if (ch[i] == ch[i + 1] && ch[i] == ch[i + 2]) {
                result = Math.max(result, ch[i] - '0');
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            builder.append((char)(48 + result));
        }
        return result == -1 ? "" : builder.toString();
    }
}