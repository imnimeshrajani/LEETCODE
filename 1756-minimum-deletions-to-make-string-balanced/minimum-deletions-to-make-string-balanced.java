class Solution {
    public int minimumDeletions(String s) {
        int b = 0, removed = 0;
        for(char c : s.toCharArray()) {
            if(c == 'a') {
                if(b > 0) {
                    removed++;
                    b--;
                }
            } else b++;
        }
        return removed;
    }
}