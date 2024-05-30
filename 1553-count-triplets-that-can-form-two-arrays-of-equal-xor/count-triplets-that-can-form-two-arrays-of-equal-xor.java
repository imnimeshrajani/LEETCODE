class Solution {
    public int countTriplets(int[] arr) {
        int a = 0, ans = 0;
        for(int i = 0; i < arr.length; i++) {
            a = arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                a ^= arr[j];
                if(a == 0) 
                    ans += j - i;
            }
        }
        return ans;
    }
}