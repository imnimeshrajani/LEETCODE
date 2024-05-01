class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        char[] arr = word.toCharArray();
        if(index == -1) return word;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if(i < index + 1) 
                str.insert(0, arr[i]);
            else
                str.append(arr[i]);
        }
        return str.toString();
        
    }
}