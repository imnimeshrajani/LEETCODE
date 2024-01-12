class Solution {
    public boolean halvesAreAlike(String s) {
        return countVowels(s.substring(0, s.length() / 2)) == countVowels(s.substring(s.length() / 2));
    }
    
    private int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) if ("AEIOUaeiou".indexOf(ch) != -1) count++;
        return count;
    }
}