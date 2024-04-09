class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] temp = new int[nums.length];
        Stack<Integer> stack = new Stack();
        for (int i = nums.length - 1; i >= 0; i--) 
            stack.push(nums[i]);
        for (int i = nums.length - 1; i >= 0; i--) {
            int n = nums[i];
            while(!stack.isEmpty() && stack.peek() <= n)
                stack.pop();
            nums[i] = stack.isEmpty() ? - 1 : stack.peek();
            stack.push(n);
        }
        return nums;
    }
}