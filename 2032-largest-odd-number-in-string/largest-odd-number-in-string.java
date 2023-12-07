class Solution {
    public String largestOddNumber(String num) {
        char[] ch =num.toCharArray();
        if(ch[ch.length-1] - '0' % 2 == 1) return num;
        int i = ch.length - 1;
        while(i>=0){
            if(ch[i] % 2 == 1) return num.substring(0,i+1);
            i--;
        }
        return "";
    }
}