class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i<j){
            char start = s.charAt(i), end = s.charAt(j);
            if(!isValid(start)) i++;
            else if(!isValid(end)) j--;
            else{
                start = (start >= 'A' && start <= 'Z') ? start += ' ' : start;
                end = (end >= 'A' && end <= 'Z') ? end += ' ' : end;
                if(start != end) return false;
                i++;
                j--;
            }  
        }
        return true;
    }
    private boolean isValid(char ch){
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ||(ch >= '0' && ch <= '9');
    }
}