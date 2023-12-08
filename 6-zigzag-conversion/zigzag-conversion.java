class Solution {
    public String convert(String s, int n) {
        if(n == 1) return s;
        char[] ch = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for(int i = 1; i <= n; i++){
            int index = i - 1;
            boolean up = true;
            while (index < ch.length){
                ans.append(ch[index]);
                if (i==1 || i==n) index += 2*(n-1);
                else {
                    index += up ? 2*(n-i) : 2*(i-1);
                    up=!up;
                }
            }
        }
        return ans.toString();
    }
}