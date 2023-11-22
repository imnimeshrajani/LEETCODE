class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] map = new int[128];
        char[] s1Array = s1.toCharArray();
        for (int index = 0; index < s1Array.length; index++)
            map[s1Array[index]]++;
        int count = s1Array.length;
        int left = 0, right = 0;
        char[] s2Array = s2.toCharArray();
        while (right < s2Array.length) {
            if (map[s2Array[right++]]-- > 0) 
                count--;
            while (count == 0) {
                if (right-left == s1.length()) return true;
                if (++map[s2Array[left++]] > 0) count++;
            }
        }
        return false;
    }

}