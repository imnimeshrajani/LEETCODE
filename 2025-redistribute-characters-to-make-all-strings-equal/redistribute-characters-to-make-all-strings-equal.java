class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        int n = words.length;
        for(String str : words)
            for(char c : str.toCharArray())
                map.put(c, map.getOrDefault(c, 0)+1);
        for(var value : map.values()) if(value % n != 0) return false;
        return true;
    }
}