class Solution {
    public String compressedString(String word) {
        char ch[] = word.toCharArray(), c = ch[0];
        int count = 1;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < ch.length - 1; i++) {
            if(ch[i] == ch[i + 1] && count < 9) {
                count++;
            } else {
                str.append(count).append(c);
                count = 1;
                c = ch[i + 1];
            }
        }
        str.append(count).append(c);
        return str.toString();
    }
}