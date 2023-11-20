class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int ans = 0;
        boolean GisContains = false, PisContains = false, MisContains = false;
        for (int i = 0; i < n - 1; i++)
            ans += 3 * travel[i];

        for (String s : garbage) 
            ans += s.length();

        for (int i = n - 1; i > 0; i--) {
            if (!garbage[i].contains("G") && GisContains == false) {
                ans -= travel[i - 1];
            } else GisContains = true;
            if (!garbage[i].contains("P") && PisContains == false) {
                ans -= travel[i - 1];
            } else PisContains = true;
            if (!garbage[i].contains("M") && MisContains == false) {
                ans -= travel[i - 1];
            } else MisContains = true;
            if(GisContains && PisContains && MisContains) break;
        }
        return ans;
    }
}