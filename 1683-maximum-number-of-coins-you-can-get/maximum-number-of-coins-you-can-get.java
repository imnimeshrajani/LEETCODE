class Solution {
    public int maxCoins(int[] piles) {
        countingSort(piles);
        int smallest = 0, ans = 0; 
        for(int i = piles.length - 2; i > smallest++; i-=2){
            ans += piles[i];
        }
        return ans;
    }
    public static void countingSort(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int[] output = new int[arr.length];
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            for (int k = 0; k < count[i]; k++) {
                output[j] = i;
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
}