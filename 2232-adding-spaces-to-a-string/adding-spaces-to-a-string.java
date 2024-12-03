class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i = 0, idx = 0; i < arr.length; i++) {
            if(idx < spaces.length && i == spaces[idx]) {
                ans.append(" ");
                idx++;
            }
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}