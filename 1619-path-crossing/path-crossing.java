class Solution {
    public boolean isPathCrossing(String path) {
        char[] ch = path.toCharArray();
        Set<String> set = new HashSet<>();
        set.add("0,0");
        boolean flag = false;
        int x = 0, y = 0;
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == 'N') x++;
            if(ch[i] == 'S') x--;
            if(ch[i] == 'E') y++;
            if(ch[i] == 'W') y--;
            StringBuilder str = new StringBuilder();
            str.append(x);
            str.append(',');
            str.append(y);
            if(set.contains(str.toString())) return true;
            else set.add(str.toString());
        }
        return false;
    }
}