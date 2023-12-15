class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        String start = paths.get(0).get(1);
        for (List<String> i : paths) map.put(i.get(0), i.get(1));
        while (map.containsKey(start)) start = map.get(start);
        return start;
    }
}