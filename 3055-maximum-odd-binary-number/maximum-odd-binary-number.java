class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for (char ch : s.toCharArray())
            if (ch == '1')
                ans.append(ch);
        int a = s.length() - ans.length();
        for (int i = 0; i < a; i++){
            System.out.println(ans.toString());
            ans.insert(ans.length()-1,0);
        }
        return ans.toString();
    }
}