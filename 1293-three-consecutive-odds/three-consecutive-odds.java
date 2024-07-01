class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int val : arr) {
            if(count == 3) return true;
            count = (val % 2 != 0 || val == 1) ? count + 1 : 0;
        }
        return count == 3;
    }
}