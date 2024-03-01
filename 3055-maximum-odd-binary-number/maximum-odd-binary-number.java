class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        for (char ch : s.toCharArray())
            if (ch == '1')
                count++;
        StringBuilder ans = new StringBuilder();
        if (count > 1)
            for (int i = 1; i < count; i++)
                ans.append('1');
        for (int i = 0; i < s.length() - count; i++)
            ans.append('0');
        ans.append('1');
        return ans.toString();
    }
}