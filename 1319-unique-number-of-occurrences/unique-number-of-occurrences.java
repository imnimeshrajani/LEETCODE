// class Solution {
//     public boolean uniqueOccurrences(int[] arr) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i : arr) map.put(i, map.getOrDefault(i, 0)+1);
//         for(var val : map.entrySet()) {
//             int v = val.getValue();
//             val.setValue(-1);
//             if(map.containsValue(v)) return false;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        boolean[] used = new boolean[1001];
        for (int i : arr) freq[1000 + i]++;
        for (int i : arr) {
            int count = freq[1000 + i];
            freq[1000 + i] = 0;
            if (count > 0) {
                if (used[count]) return false;
                used[count] = true;
            }
        }
        return true;
    }
}