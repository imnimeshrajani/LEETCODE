class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int M = 0, P = 0, G = 0;
        for (String s : garbage) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'M') M++;
                else if (s.charAt(j) == 'P') P++;
                else G++;
            }
        }
        for (int i = 1; i < travel.length; i++)
            travel[i] += travel[i-1];
        int ans = M + P +G;
        for (int i = garbage.length -1; i >= 0 && (M != 0 || P != 0 || G != 0); i--) {
            for (int j = 0; j < garbage[i].length(); j++) {
                if(garbage[i].charAt(j) == 'M' && M != 0){
                    if(i!=0)  ans += travel[i-1];
                    M = 0;
                } else if (garbage[i].charAt(j) == 'P' && P != 0) {
                    if(i!=0)  ans += travel[i-1];
                    P = 0;
                } else if (garbage[i].charAt(j) == 'G' && G != 0) {
                    if(i!=0)  ans += travel[i-1];
                    G = 0;
                }
            }
        }
        return ans;
    }
}