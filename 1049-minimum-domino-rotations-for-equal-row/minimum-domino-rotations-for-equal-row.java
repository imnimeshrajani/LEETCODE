class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length, a = tops[0], b = bottoms[0];
        for(int i = 1; i < n; i++) {
            if(a != tops[i] && a != bottoms[i]) a = -1;
            if(b != tops[i] && b != bottoms[i]) b = -1;
            if(a == -1 && b == -1) return -1;
        }

        a = (a != -1) ? a : b;
        int tswap = 0, bswap = 0;
        for(int i = 0; i < n; i++) {
            if(a != tops[i]) tswap++;
            if(a != bottoms[i]) bswap++;
        }
        return Math.min(tswap, bswap);
    }
}