class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0, count = 0, prev = 0;
        for(int i = 0; i < bank.length; i++){
            count = counting(bank[i].toCharArray(), count);
            if(count != 0) {
                if(prev != 0) ans += prev * count;
                prev = count;
            }
            count = 0;
        }
        return ans;
    }
    public int counting(char[] c, int count) {
        for(char ch : c) if(ch == '1') count++;
        return count;
    }
}