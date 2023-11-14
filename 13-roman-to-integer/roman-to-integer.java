class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int currValue = get(s.charAt(i));
            if (i < s.length()-1 && currValue < get(s.charAt(i+1))) ans -= currValue;
            else ans += currValue;
        }
        return ans;
    }
    public static int get(char ch){
        if(ch == 'I') return 1;
        else if(ch == 'V') return 5;
        else if(ch == 'X') return 10;
        else if(ch == 'L') return 50;
        else if(ch == 'C') return 100;
        else if(ch == 'D') return 500;
        else return 1000;
    }
}