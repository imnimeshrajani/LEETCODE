class Solution {
    public boolean canConstruct(String s, int k) {
        if(k > s.length()) return false;
        int freq[] = new int[26], count = 0;
        for(char c : s.toCharArray()) 
            freq[c - 'a']++;

        for(int i : freq) if(i % 2 == 1) count++;
        return count <= k;
    }
}