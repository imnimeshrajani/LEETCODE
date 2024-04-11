class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k) return "0";
        Stack<Character> st = new Stack();
        for (char c : num.toCharArray()) {
            while(!st.isEmpty() && k > 0 && st.peek() > c) {
                k--;
                st.pop();
            }
            st.push(c);
        }
        while(k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()) 
            ans.insert(0,st.pop());
        while(ans.length() != 0 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
}