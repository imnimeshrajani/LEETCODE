class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        String start = paths.get(0).get(1);
        for(int i = 0; i < paths.size(); i++){
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        for(int i = 0; i < paths.size(); i++){
            if(map.containsKey(start)) start = map.get(start);
        }
        return start;
    }
}