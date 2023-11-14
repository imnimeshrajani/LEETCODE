class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        int index = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < strs.length; j++)
                if(i>=strs[j].length() || strs[j].charAt(i) != str.charAt(i)) 
                    return ans.toString();
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
}