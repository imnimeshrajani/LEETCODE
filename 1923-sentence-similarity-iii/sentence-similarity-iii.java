class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.equals(sentence2)) return true;

        String[] s1 = sentence1.split(" "), s2 = sentence2.split(" ");
        
        int start1 = 0, start2 = 0, end1 = s1.length - 1, end2 = s2.length - 1;

        while (start1 <= end1 && start2 <= end2 && s1[start1].equals(s2[start2])) {
            start1++;
            start2++;
        }
        
        while (end1 >= start1 && end2 >= start2 && s1[end1].equals(s2[end2])) {
            end1--;
            end2--;
        }
        
        return end1 < start1 || end2 < start2;
    }
}