class Solution {
    public int minAddToMakeValid(String s) {
    int res = 0;
       Stack<Character> stack = new Stack<>();
       for(char c : s.toCharArray()){
           if(c == '('){
               stack.push(c);
           }
           else{
               if(stack.empty())
                   res++;
               else
                   stack.pop();
           }
       }
       return res + stack.size();
    }
}