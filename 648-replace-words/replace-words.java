class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        // System.out.println(Arrays.toString(words));
        
        for(int i = 0; i < words.length; i++) {
            for(String str : dictionary) 
                if(words[i].startsWith(str)) 
                    words[i] = str;
        }
        StringBuilder ans = new StringBuilder();
        for(String word : words) {
            ans.append(word);
            ans .append(" ");
        }
        return ans.toString().trim();
    }
}