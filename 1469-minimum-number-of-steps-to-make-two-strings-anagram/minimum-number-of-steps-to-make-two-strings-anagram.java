class Solution {
    public int minSteps(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(char c : ch) map.put(c, map.getOrDefault(c,0)+1);
        ch = t.toCharArray();
        int ans = 0;
        for(char c : ch) {
            if(map.containsKey(c) && map.get(c) > 0) map.put(c, map.get(c)-1);
            else ans++;
        }
        return ans;
    }
}