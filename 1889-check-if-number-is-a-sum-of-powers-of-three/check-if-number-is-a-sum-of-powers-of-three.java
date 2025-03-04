class Solution {
    public boolean checkPowersOfThree(int n) {
        for(int i = 14; i >= 0; i--) {
            int num = (int) Math.pow(3, i);
            if(n - num >= 0) n -= num;
            if(n == 0) return true;
        }
        return false;
    }
}