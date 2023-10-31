class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        ArrayList<Integer> a = new ArrayList<>();
        for (int i : nums1) arr[i]++;
        for (int i : nums2) if (arr[i]>0) {
            arr[i]--;
            a.add(i);
        }
        int ans[] = new int[a.size()], index = 0;
        for (Integer integer : a) ans[index++] = integer;
        return ans;
    }
}