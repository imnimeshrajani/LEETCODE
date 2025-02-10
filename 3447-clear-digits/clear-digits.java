class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c > '9') {
                st.add(c);
                continue;
            }
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.insert(0, st.pop());
        return sb.toString();
    }
}