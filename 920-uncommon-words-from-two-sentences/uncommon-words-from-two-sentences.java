class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s = s1 + " " + s2;
        Map<String, Integer> map = new HashMap<>();
        String[] arr = s.split(" "), ans;
        int size = 0;
        for(String str : arr) 
            map.put(str, map.getOrDefault(str, 0) + 1);
        
        ArrayList<String> list = new ArrayList<>();
        for (String word : map.keySet()) {
            if (map.get(word) == 1) list.add(word);
        }
        return list.toArray(new String[list.size()]);
    }
}