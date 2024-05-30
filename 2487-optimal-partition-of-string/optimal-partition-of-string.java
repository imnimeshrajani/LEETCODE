class Solution {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0, ans = 1;
        while(i < s.length()) {
            if(set.contains(s.charAt(i))) {
                ans++;
                set = new HashSet<>();
            }
            set.add(s.charAt(i++));
        }
        return ans;
    }
}