class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1) return word;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < word.length(); i++) {
            if(i < index + 1) 
                str.insert(0, word.charAt(i));
            else
                str.append(word.charAt(i));
        }
        return str.toString();
        
    }
}