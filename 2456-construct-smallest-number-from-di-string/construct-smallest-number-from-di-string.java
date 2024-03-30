class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder ans = new StringBuilder();
        for(int i = 1; i <= pattern.length() + 1; i++)
            ans.append(i);
        int i = 0, j = 0;
        while (j < pattern.length()) {
            if(pattern.charAt(j) == 'D') {
                i = j;
                while(j < pattern.length() && pattern.charAt(j) == 'D') j++;
            int temp = j;
            while(i < temp) {
                char s = ans.charAt(temp), e = ans.charAt(i);
                ans.setCharAt(i++, s);
                ans.setCharAt(temp--, e);
            }
            }
            else 
                j++;
            
        }
        System.out.println(ans.toString());
        return ans.toString();
    }
}