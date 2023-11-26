class Solution {
    public String countAndSay(int n) {
        String s ="1";
        for(int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            char c = s.charAt(0);
            int count = 1;
            for(int j = 1; j < s.length(); j++){
                if(s.charAt(j) == c) count++;
                else {
                    sb.append(count);
                    sb.append(c);
                    c = s.charAt(j);
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(c);
            s = sb.toString();
        }
        return s;
    }
}