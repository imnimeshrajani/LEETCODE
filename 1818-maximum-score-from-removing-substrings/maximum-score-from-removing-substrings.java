class Solution {
    public int maximumGain(String s, int x, int y) {
        int a = 0, b = 0, min = Math.min(x, y), ans = 0;
        Stack<Integer> st = new Stack();
        for(char c : s.toCharArray()) {
            if(c >'b') {
                ans += Math.min(a, b) * min;
                a = b = 0;
            } else if(c == 'a') {
                if(x < y && b > 0) {
                    b--;
                    ans += y;
                } else a++;
            } else {
                if(x > y && a > 0) {
                    a--;
                    ans += x;
                } else b++;
            }
        }
        return ans + Math.min(a, b) * min;
    }
}