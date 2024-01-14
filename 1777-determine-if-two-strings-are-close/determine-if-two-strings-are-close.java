class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        int a1[] = new int[26], a2[] = new int[26];
        Set<Character> st=new HashSet<>();
        for(char c:word1.toCharArray()){
            a1[c-'a']++;
            st.add(c);
        }
        for(char c:word2.toCharArray()){
            a2[c-'a']++;
            if(!st.contains(c)) return false;
        } 
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i=0;i<26;i++) if(a1[i]!=a2[i]) return false;
        return true;
    }
}