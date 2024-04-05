class Solution {
    public String makeGood(String s) {
        // Stack<Character> st = new Stack();
        // for (char c : s.toCharArray()) {
        //     if(!st.isEmpty() && Math.abs(c - st.peek()) == 32) st.pop();
        //     else st.push(c);
        // }
        // StringBuilder ans = new StringBuilder();
        // while(!st.isEmpty()) {
        //     ans.insert(0,st.pop());
        // }
        // return ans.toString();

        if (s.length() == 0 || s.length() == 1) return s;

        StringBuilder sb = new StringBuilder();
        sb.append(s);

        int i = 0;
        while (i < sb.length() - 1)
        {
            char leftChar = sb.charAt(i), rightChar = sb.charAt(i + 1);

            if (Math.abs(leftChar - rightChar) == 32)
            {
                sb.delete(i, i + 2);
                if (i > 0) i--;
            } else i++;
        }
        return sb.toString();
    }
}