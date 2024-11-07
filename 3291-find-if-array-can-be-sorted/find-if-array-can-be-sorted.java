class Solution {
    public boolean canSortArray(int[] nums) {
        int pmax = 0, cmin = 0, cmax = 0;
        byte pcnt = 0;
        for (final int v : nums) {
            final byte ccnt = (byte)Integer.bitCount(v);
            if (pcnt == ccnt) {
                cmin = Math.min(cmin, v);
                cmax = Math.max(cmax, v);
            } else if (cmin < pmax) {
                return false;
            } else {
                pmax = cmax;
                cmin = cmax = v;
                pcnt = ccnt;
            }
        }
        return cmin >= pmax;
    }
}