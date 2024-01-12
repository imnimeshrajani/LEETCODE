class Solution {
    public boolean halvesAreAlike(String s) {
        return countVowels(s.substring(0, s.length() / 2), 0) == countVowels(s.substring(s.length() / 2), 0);
    }
    
    private int countVowels(String str, int count) {
        for (char ch : str.toCharArray()) if ("AEIOUaeiou".indexOf(ch) != -1) count++;
        return count;
    }
}