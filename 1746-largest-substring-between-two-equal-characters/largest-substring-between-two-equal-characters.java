class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = -1;
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) ans = Math.max(ans, i - map.get(ch[i]) - 1); 
            else map.put(ch[i], i);
        }
        return ans;
    }
}