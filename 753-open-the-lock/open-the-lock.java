class Solution {
    public int openLock(String[] deadends, String target) {
        // if (target.equals("0000"))
        //     return 0;
                
        // Set<String> visited = new HashSet<>(Arrays.asList(deadends));
        
        // if (visited.contains("0000"))
        //     return -1;
        
        // Queue<String> q = new LinkedList<>();
        // q.offer("0000");
        // visited.add("0000");
        // int cnt = 0;
        // while (!q.isEmpty()) {
        //     int len = q.size();          
        //     while (len > 0) {
        //         String curr = q.poll();
                
        //         for (int i = 0; i < 4; i++) {
        //             char c = curr.charAt(i);
        //             String up = curr.substring(0, i) + (c == '9' ? 0 : c - '0' + 1) + curr.substring(i + 1);
        //             String dwn = curr.substring(0, i) + (c == '0' ? 9 : c - '0' - 1) + curr.substring(i + 1);
                                            
        //             if (up.equals(target) || dwn.equals(target))
        //                 return cnt + 1;
                    
        //             if (!visited.contains(up)) {
        //                 q.offer(up);
        //                 visited.add(up);
        //             }
        //             if (!visited.contains(dwn)) {
        //                 q.offer(dwn);
        //                 visited.add(dwn);
        //             }
        //         }
                
        //         len--;
        //     }
              
        //     cnt++;
        // }
        
        // return -1;
        int[] pow10 = {1, 10, 100, 1000};
        int[] visit = new int[10000];
        for(String dead: deadends) {
            visit[Integer.parseInt(dead)] = 2;
        }
        int src = 0, dest = Integer.parseInt(target), steps = 0, dir = 1;
        if(visit[src] == 2 || visit[dest] == 2) return -1;
        if(src == dest) return 0;
        Queue<Integer> forward = new LinkedList<>(), backward = new LinkedList<>();
        forward.add(src);
        visit[src] = 1;
        backward.add(dest);
        visit[dest] = -1;
        while(!forward.isEmpty() && !backward.isEmpty()) {
            if(forward.size() > backward.size()) {
                Queue<Integer> tmp = forward; forward = backward; backward = tmp;
                dir = -dir;
            }
            steps++;
            int size = forward.size();
            while(size-- > 0) {
                int cur = forward.poll();
                for(int p: pow10) {
                    int d = (cur / p) % 10;
                    for(int i = -1; i <= 1; i += 2) {
                        int z = d + i;
                        z = z == -1 ? 9 : (z == 10 ? 0 : z);
                        int next = cur + (z - d) * p;
                        if(visit[next] == -dir) return steps;
                        if(visit[next] == 0) {
                            forward.add(next);
                            visit[next] = dir;
                        }
                    }
                }
            }
        }
        return -1;
    }
}