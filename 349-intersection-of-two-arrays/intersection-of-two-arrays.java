class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
            for (int i : nums1) set1.add(i);
            for (int i : nums2) if (set1.contains(i))set2.add(i);
            int ans[] = new int[set2.size()], index = 0;
            for (Integer integer : set2) ans[index++] = integer;
            return ans;
        }
}