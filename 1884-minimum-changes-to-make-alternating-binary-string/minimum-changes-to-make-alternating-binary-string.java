class Solution {
    public int minOperations(String s) {
        char[] ch = s.toCharArray();

        return Math.min(solve(ch, ch[0]), solve(ch, ch[0] == '0' ? '1' : '0'));
    }
    public int solve(char[] ch, char c) {
        int count = 0;
        for(var character : ch) {
            if(character == c) {
                count++;
                c = (c=='0') ? '1' : '0';
            } else c = character;
        }
        return count;
    }
}