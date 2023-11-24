class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int smallest = 0, ans = 0; 
        for(int i = piles.length - 2; i > smallest++; i-=2){
            ans += piles[i];
        }
        return ans;
    }
}