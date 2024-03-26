class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source == target) return 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        createMap(map, routes);
        if(!map.containsKey(source) || !map.containsKey(target)) return -1;
        Set<Integer> bus = new HashSet<>(), busStop = new HashSet<>();
        LinkedList<Integer> que = new LinkedList<>();
        int cost = 0;
        que.addLast(source);
        busStop.add(source);
        while(que.size() > 0) {
            int size = que.size();
            while (size-- > 0) {
                int q = que.removeFirst();
                if(q == target) return cost;
                List<Integer> buses = map.get(q);
                for(int i : buses) {
                    if(bus.contains(i)) continue;
                    for(int route : routes[i]) {
                        if(busStop.contains(route)) continue;
                        que.addLast(route);
                        busStop.add(route);
                    }
                    bus.add(i);
                }
            }
            cost++;
        }
        return -1;
    }

    void createMap(Map<Integer, List<Integer>> map, int[][] routes) {
        for(int i = 0; i < routes.length; i++) {
            for(int j = 0; j < routes[i].length; j++) {
                if(!map.containsKey(routes[i][j])) 
                    map.put(routes[i][j], new ArrayList<Integer>());
                List<Integer> list = map.get(routes[i][j]);
                list.add(i);
                map.put(routes[i][j], list);
            }
        }
    }
}