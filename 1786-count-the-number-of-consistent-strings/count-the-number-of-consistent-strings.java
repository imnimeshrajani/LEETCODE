class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()) set.add(c);
        int ans = 0;
        for(String word : words) {
            boolean flag = true;
            for(char ch : word.toCharArray()) {
                if(!set.contains(ch)) {
                    flag = false;
                    break;
                }
            }
            if(flag) ans++;
        }
        return ans;
    }
}