class Solution {
    public int numberOfMatches(int n) {
        // int matches = 0;
        // while(n != 1){
        //     if(n%2==0) matches += n /= 2;
        //     else {
        //         n = ((n - 1) / 2);
        //         matches += n++;
        //     }
        // }
        return n - 1;
    }
}