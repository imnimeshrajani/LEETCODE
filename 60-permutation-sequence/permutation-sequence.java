class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            nums.add(i);
            factorial *= i;
        }
        return solve(nums, k - 1, factorial).toString();
    }
    StringBuilder solve(List<Integer> nums, int k, int factorial) {
        if(nums.size() == 0) return new StringBuilder();
        int size = factorial / nums.size();
        StringBuilder num = new StringBuilder(nums.get(k/size).toString());
        nums.remove(k/size);
        return num.append(solve(nums, k % size, size));
    }
}