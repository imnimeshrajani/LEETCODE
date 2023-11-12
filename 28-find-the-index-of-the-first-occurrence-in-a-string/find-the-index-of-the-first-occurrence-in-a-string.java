class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0) && needle.length()<=haystack.length()-i){
                int temp = i, index = 0;
                while(index<needle.length()){
                    if(needle.charAt(index) != haystack.charAt(temp++))break;
                    index++;
                    if(index == needle.length()) return i;
                }
            }
        }
        return -1;
    }
}