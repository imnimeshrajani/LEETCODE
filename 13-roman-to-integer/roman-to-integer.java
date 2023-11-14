class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        // HashMap<Character, Integer> map = new HashMap<>();
        // map.put('I',1);
        // map.put('V',5);
        // map.put('X',10);
        // map.put('L',50);
        // map.put('C',100);
        // map.put('D',500);
        // map.put('M',1000);

        for (int i = 0; i < s.length(); i++) {
            int currValue = get(s.charAt(i));
            if (i < s.length()-1 && currValue < get(s.charAt(i+1))) ans -= currValue;
            else ans += currValue;
        }
        return ans;
    }
    public static int get(char ch){
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        return 1000;
    }
}