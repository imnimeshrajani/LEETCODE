class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0, count = 0, prev = 0;
        for(int i = 0; i < bank.length; i++){
            for(int j = 0; j < bank[i].length(); j++) if(bank[i].charAt(j) == '1') count++;
            if(count!=0) {
                if(prev != 0) ans += prev * count;
                prev = count;
            }
            count = 0;
        }
        return ans;
    }
}