class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        char[] ch = s.toCharArray();
        int current = ch.length - 1;
        for (int i = ch.length - 1; i > 0; i--){
            for (int j = 0; j + i < ch.length; j++){
                if (ch[j] == ch[j+i]) return i-1;
            }
            current--;
        }
        return -1;
    }
}