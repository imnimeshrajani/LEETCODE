class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        return countVowels(s.substring(0, mid)) == countVowels(s.substring(mid));
    }
    
    private int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) if ("AEIOUaeiou".indexOf(ch) != -1) count++;
        return count;
    }
}