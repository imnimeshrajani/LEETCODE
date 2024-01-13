class Solution {
    public int minSteps(String s, String t) {
        int count[] = new int[26], ans = 0;
        byte[] sb = s.getBytes(), tb = t.getBytes();
        for (byte b : sb) count[b - 'a']++;
        for (byte b : tb) count[b - 'a']--;
        for (int i : count) ans += Math.abs(i);
        return ans / 2;
    }
}