class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int remaining = 0, ans = numBottles;
        while(numBottles >= numExchange) {
            remaining = numBottles % numExchange;
            numBottles = numBottles / numExchange;
            ans += numBottles;
            numBottles += remaining;
        }
        return ans;
    }
}