class Solution {
    public int slidingPuzzle(int[][] board) {
        String ans = "123450";
        int[][] arr = {{1,3}, {0,2,4}, {1,5}, {0, 4}, {1,3,5}, {4,2}};
        StringBuilder str = new StringBuilder();
        for(int[] i : board) 
            for(int j : i)
                str.append(j);
        if(str.equals(ans)) return -1;
        Set<String> set = new HashSet<>();
        Queue<String> que = new LinkedList<>();
        set.add(str.toString());
        que.add(str.toString());
        int level = 0;
        while(que.size() > 0) {
            int size = que.size();
            while(size-- > 0) {
                String s = que.remove();
                if(ans.equals(s.toString())) return level; 
                int idx = s.indexOf("0");
                    for(int i : arr[idx]) {
                        StringBuilder temp = new StringBuilder(s);
                        temp.setCharAt(i, s.charAt(idx));
                        temp.setCharAt(idx, s.charAt(i));

                        if(set.contains(temp.toString())) continue;
                        set.add(temp.toString());
                        que.add(temp.toString());
                }
            }
            level++;
        }
        return -1;
    }
}