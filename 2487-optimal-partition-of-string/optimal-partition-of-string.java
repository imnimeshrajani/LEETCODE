class Solution {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0, ans = 1;
        char[] arr = s.toCharArray();
        while(i < arr.length) {
            if(set.contains(arr[i])) {
                ans++;
                set.clear();
            }
            set.add(arr[i++]);
        }
        return ans;
    }
}