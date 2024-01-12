class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        String firstHalf = s.substring(0, mid);
        String secondHalf = s.substring(mid);
        return countVowels(firstHalf) == countVowels(secondHalf);
    }
    
    private int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) if ("AEIOUaeiou".indexOf(ch) != -1) count++;
        return count;
    }
}