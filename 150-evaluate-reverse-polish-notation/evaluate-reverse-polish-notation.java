class Solution {
    // int pos;
    // public int evalRPN(String[] tokens) {
    //     this.pos = tokens.length-1;
    //     return evaluate(tokens);
    // }

    // public int evaluate(String[] t){
    //     String token = t[pos];
    //     pos--;
    //     if(token.equals("+"))return evaluate(t) + evaluate(t); 
    //     else if(token.equals("*")) return evaluate(t) * evaluate(t);
    //     else if(token.equals("-")) return -evaluate(t) + evaluate(t);
    //     else if(token.equals("/")){
    //         int right = evaluate(t);
    //         return evaluate(t) / right;
    //     }else return Integer.parseInt(token);
    // }
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack();
        for(String str : tokens) {
            if(str.equals("+")) s.add(s.pop() + s.pop());
			else if(str.equals("/")) {
                int b = s.pop(), a = s.pop();
                s.add(a / b);
            }
			else if(str.equals("*")) s.add(s.pop() * s.pop());
			else if(str.equals("-")) s.add(-s.pop() + s.pop());
			else s.add(Integer.parseInt(str));
        }
        return s.pop();
    }
}