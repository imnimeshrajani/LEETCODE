class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        if(str1.length() < str2.length()) return false;
        char[] arr1 = str1.toCharArray(), arr2 = str2.toCharArray();
        int idx = 0;
        for(char ch : arr1)
            if(ch == arr2[idx] || (char)((++ch > 122) ? 97 : ch) == arr2[idx]) 
                if(++idx == arr2.length) return true;
            
        return false;
    }
}