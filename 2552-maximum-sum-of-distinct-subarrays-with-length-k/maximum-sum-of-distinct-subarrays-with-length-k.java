class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int n = arr.length, start = 0;
        Set<Integer> set = new HashSet<>();
        long currentSum = 0, maxSum = 0;
        
        for (int end = 0; end < n; end++) {
            if (!set.contains(arr[end])) {
                currentSum += arr[end];
                set.add(arr[end]);
                
                if (end - start + 1 == k) {
                    maxSum = Math.max(maxSum, currentSum);
                    currentSum -= arr[start];
                    set.remove(arr[start]);
                    start++;
                }
            } else {
                while (arr[start] != arr[end]) {
                    currentSum -= arr[start];
                    set.remove(arr[start]);
                    start++;
                }
                start++;
            }
        }
        
        return maxSum;
    }
}