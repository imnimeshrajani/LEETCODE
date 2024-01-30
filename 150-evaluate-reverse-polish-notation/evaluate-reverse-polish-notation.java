class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack();
        for(String str : tokens) {
            if(str.equals("+")) s.add(s.pop() + s.pop());
			else if(str.equals("/")) {
                int b = s.pop(), a = s.pop();
                s.add(a / b);
            }
			else if(str.equals("*")) s.add(s.pop() * s.pop());
			else if(str.equals("-")) {
                int b = s.pop(), a = s.pop();
                s.add(a - b);
            }
			else s.add(Integer.parseInt(str));
        }
        return s.pop();
    }
}