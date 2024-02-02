class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int val = 0, multi = 1, num = low, count = 1, add = 0;
        List<Integer> ans = new ArrayList<>();
        while (num != 0) {
            num /= 10;
            val = (val * 10) + count++;
            add = (add * 10) + 1;
        }
        int store = val;
        while(val <= high) {
            if(val >= low) {
                ans.add(val);
            }
            if(val % 10 == 9) {
                store = (store * 10) + count++;
                add = (add * 10) + 1;
                val = store;
            }
            else val += add;
        }
        return ans;
    }
}