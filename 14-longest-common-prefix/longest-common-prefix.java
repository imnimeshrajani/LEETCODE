class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 0; j < strs.length; j++)
                if(i>=strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) 
                    return ans.toString();
            ans.append(strs[0].charAt(i));
        }
        return ans.toString();
    }
}