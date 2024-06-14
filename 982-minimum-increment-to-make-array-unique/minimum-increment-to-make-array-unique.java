class Solution {
    public int minIncrementForUnique(int[] nums) {
        if(nums.length == 1) return 0;
        int n = 0, carry = 0, moves = 0;
        // for(int i : nums) if(n < i) n = i;
        int[] freq = new int[1000001];
        for(int i : nums) freq[i]++;
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 1) {
                carry = freq[i] - 1;
                moves += carry;
                freq[i + 1] += carry;
            }
        }
        System.out.println(carry);
        return moves;
    }
}