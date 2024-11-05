class Solution {
    public int minChanges(String s) {
        int count = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length - 1; i += 2) 
            if (ch[i] != ch[i + 1])
                count++;
            
        return count;
    }
}