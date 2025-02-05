class Solution {
    public int minPartitions(String n) {
        int c = 0;
        for(char ch : n.toCharArray()) 
            c = Math.max(c, ch - '0');
        return c;
    }
}