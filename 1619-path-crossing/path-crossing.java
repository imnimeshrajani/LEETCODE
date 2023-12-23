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
            String cod =  x + "," + y;
            if(set.contains(cod)) return true;
            else set.add(cod);
        }
        return false;
    }
}