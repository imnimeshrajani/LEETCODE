class Solution {
    public int secondsToRemoveOccurrences(String s) {
        char[] str = s.toCharArray();
        int zeroCount = 0, waitTime = 0, idx = str.length - 1, i = 0;
        while(idx >= 0 && str[idx] != '1') {
            idx--;
        }
        while(i < idx && str[i] == '1') {
            i++;
        }
        for(;i<idx;i++) {
            if(str[i] == '0') {
                zeroCount++;
                if(str[i + 1] == '0' && waitTime > 0) {
                    waitTime--;
                }
            } else if(str[i + 1] == '1') {
                waitTime++;
            }
        }
        return zeroCount + waitTime;
    }
}