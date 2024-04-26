class Solution {
    public boolean checkString(String s) {
        boolean a = false, b = false;
        for(char c : s.toCharArray()) {
            if(c == 'a') {
                if(b) return false;
                a = true;
            } else b = true;
        }
        return true;
    }
}