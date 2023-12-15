class Solution {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty()) return 0;
        char[] ch = s.toCharArray();
        System.out.print(Arrays.toString(ch));
        int idx = ch.length - 1, ans = 0;
        while(ch[idx]==' ') idx--;
        while(idx >=0 && ch[idx--]!=' ') ans++;
        return ans;
    }
}