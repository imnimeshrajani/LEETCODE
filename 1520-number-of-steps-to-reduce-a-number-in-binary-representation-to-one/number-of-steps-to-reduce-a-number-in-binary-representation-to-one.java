class Solution {
    public int numSteps(String s) {
        char[] arr = s.toCharArray();
        int ans = 0, carry = 0;
        for(int i = arr.length - 1; i > 0; i--) {
            if((arr[i] - '0') + carry == 1) {
                carry = 1;
                ans += 2;
            }
            else ans++;
        }
        return ans + carry;
    }
}
// 1 1 0 1
// 1 1 1 0
// 0 1 1 1
// 1 0 0 0
// 0 1 0 0
// 0 0 1 0
// 0 0 0 1