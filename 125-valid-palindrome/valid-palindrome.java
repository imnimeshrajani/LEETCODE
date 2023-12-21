class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        char[] ch = s.toCharArray();
        while(i<j){
            if(!isValid(ch[i])) i++;
            else if(!isValid(ch[j])) j--;
            else{
                ch[i] = (ch[i] >= 'A' && ch[i] <= 'Z') ? ch[i] += ' ' : ch[i];
                ch[j] = (ch[j] >= 'A' && ch[j] <= 'Z') ? ch[j] += ' ' : ch[j];
                if(ch[i] != ch[j]) return false;
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