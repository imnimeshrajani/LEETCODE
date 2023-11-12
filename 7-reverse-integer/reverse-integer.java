class Solution {
    public int reverse(int x) {
        long ans = 0;
        if(x >= 2147483647 || x <= -2147483648) return 0;
        while(x!=0){
            if(ans!=0) ans *=10;
            ans += x % 10;
            x /= 10;
        }
        if(ans >= 2147483647 || ans <= -2147483648) return 0;
        return (int) ans;
    }
}