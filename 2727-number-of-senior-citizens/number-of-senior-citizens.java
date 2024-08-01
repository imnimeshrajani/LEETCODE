class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String str : details) {
            if(str.charAt(11) > '6' || (str.charAt(11) == '6' && str.charAt(12) > '0')) ans++;
        }
        return ans;
    }
}