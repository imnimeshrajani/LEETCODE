class Solution {
    int i = 0;
    public String reverseParentheses(String s) {
        return helper(s.toCharArray());
    }
    String helper(char[] s) {
        StringBuilder str = new StringBuilder();
        while(i < s.length) {
            if(s[i] == ')') {
                i++;
                return str.reverse().toString();
            } else if(s[i] == '(') {
                i++;
                str.append(helper(s));
            } else 
                str.append(s[i++]);
        }
        return str.toString();
    }
}