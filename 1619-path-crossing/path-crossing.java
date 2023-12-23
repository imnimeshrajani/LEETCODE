class Solution {
    public int x = 0, y = 0;
    public boolean isPathCrossing(String path) {
        char[] ch = path.toCharArray();
        Set<String> set = new HashSet<>();
        set.add("0,0");
        boolean flag = false;
        for(int i = 0; i < ch.length; i++) {
            String s =solve(ch[i]);
            if(set.contains(s)) return true;
            else set.add(s);
        }
        return false;
    }
    public String solve(char ch) {
            if(ch == 'N') x++;
            if(ch == 'S') x--;
            if(ch == 'E') y++;
            if(ch == 'W') y--;
            StringBuilder str = new StringBuilder();
            str.append(x);
            str.append(',');
            str.append(y);
            return str.toString();
    }
}