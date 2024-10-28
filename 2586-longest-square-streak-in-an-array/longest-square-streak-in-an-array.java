import java.util.*;

class Solution {
    public int longestSquareStreak(int[] nums) {
        TreeSet<Integer> sortedSet = new TreeSet<>();
        for (int num : nums) 
            sortedSet.add(num);
        
        
        HashSet<Integer> numSet = new HashSet<>(sortedSet);
        int maxLength = 0;
        for (int num : sortedSet) {
            int length = 0;
            long current = num;
            
            while (current <= Integer.MAX_VALUE && numSet.contains((int)current)) {
                length++;
                current = current * current;
            }
            
            if (length > 1) 
                maxLength = Math.max(maxLength, length);
        }
        
        return maxLength > 1 ? maxLength : -1;
    }
}