class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++) 
            if(s.charAt(i) != 32  && (s.charAt(i) >= 'a' && s.charAt(i) <='z') || (s.charAt(i) >= '0' && s.charAt(i) <='9')) str.append(s.charAt(i));
        int i = 0, j = str.length()-1;
        while(i<j) if(str.charAt(i++) != str.charAt(j--)) return false;
        return true;
    }
}