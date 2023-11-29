public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if(n == 0) return 0;
        long abs = n;
        abs = Math.abs(abs);
        int ans = 0,count = 0 ,use = 0,lastbit = 0;
        while(abs > 0) {
            if(abs % 2 == 1) {
                if(count == 0) lastbit = use;
                count++;
            }
            abs /= 2;
            use++;
        }
        if(n < 0) {
            count = use - lastbit - count + 1;
            count += 32 - use;
        }
        return count;
    }
}