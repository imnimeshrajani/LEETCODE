class Solution {
    public int minPartitions(String n) {
        char c = '0';
        for(char ch : n.toCharArray()) 
            c = (char) Math.max(c, ch);
        return c - '0';
    }
}