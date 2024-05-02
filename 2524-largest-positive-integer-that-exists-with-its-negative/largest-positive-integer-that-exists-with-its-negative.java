class Solution {
    public int findMaxK(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // int ans = 0;
        // for(int i : nums) {
        //     if(set.contains((i * -1))) ans = Math.max(ans, Math.abs(i));
        //     else set.add(i);
        // }
        // return ans == 0 ? -1 : ans;

        int[] arr = new int[1001];
        int max = -1;
        for (int n : nums) {
            int index = n > 0 ? n : -n;
            if (arr[index] != n) 
                arr[index] += n;
            
            if (arr[index] == 0) 
                max = max > index ? max : index;
        }
        return max;
    }
}