class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        for(String str : wordDict) set.add(str);
        helper(s, set, 0, new ArrayList<>());
        return ans;
    }
    void helper(String s, Set<String> set, int idx, List<String> arr) {
        for(int i = idx + 1; i <= s.length(); i++) {
            String str = s.substring(idx, i);
            if(set.contains(str)) {
                arr.add(str);
                if(i == s.length()) {
                    StringBuilder sb = new StringBuilder();
                    for(String word : arr) {
                        sb.append(word);
                        sb.append(" ");
                    }
                    ans.add(sb.toString().trim());
                } else helper(s, set, i, arr);
                arr.remove(arr.size() - 1);
            }
        }
    }
}