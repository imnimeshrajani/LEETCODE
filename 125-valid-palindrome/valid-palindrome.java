class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < ch.length; i++) 
            if(ch[i] != 32  && (ch[i] >= 'a' && ch[i] <='z') || (ch[i] >= '0' && ch[i] <='9')) str.append(s.charAt(i));
        int i = 0, j = str.length()-1;
        while(i<j) if(str.charAt(i++) != str.charAt(j--)) return false;
        return true;
    }
}