class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack();
        for(char c : s.toCharArray()) {
            if(!st.isEmpty() && st.peek() == c)
                while(!st.isEmpty() && st.peek() == c) 
                    st.pop();
            else st.push(c);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()) ans.insert(0, st.pop());
        return ans.toString();
    }
}