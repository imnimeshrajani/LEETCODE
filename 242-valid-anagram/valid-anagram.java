class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(var c : ch) map.put(c, map.getOrDefault(c,0)+1);
        ch = s.toCharArray();
        if(ch.length < t.length()) return false;
        for(var c : ch) {
            if(!map.containsKey(c) || map.get(c)==0) return false;
            map.put(c, map.get(c)-1);
        }
        return true;
    }
}