class Solution {
    public int secondsToRemoveOccurrences(String s) {
        char[] str = s.toCharArray();
        int zeroCount = 0, extraSec = 0, index = str.length - 1, i = 0;
        while(index >= 0 && str[index] != '1') 
            index--;
        while(i < index && str[i] == '1') 
            i++;
        for(;i<index;i++) {
            if(str[i] == '0') {
                zeroCount++;
                if(str[i + 1] == '0' && extraSec > 0) {
                    extraSec--;
                }
            } else if(str[i + 1] == '1') {
                extraSec++;
            }
        }
        return zeroCount + extraSec;
    }
}