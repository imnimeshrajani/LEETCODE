class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int freq[] = new int[1001], idx = 0;
        for(int i : arr1) freq[i]++;
        
        for(int i = 0; i < arr2.length; i++) {
            int len = freq[arr2[i]];
            for(int j = 0; j < len; j++) {
                arr1[idx++] = arr2[i];
                freq[arr2[i]]--;
            }
        }
        while(idx != arr1.length) {
            for(int i = 0; i < freq.length; i++) {
                while(i < freq.length - 1 && freq[i] == 0) i++;
                while(freq[i] != 0) {
                    arr1[idx++] = i;
                    freq[i]--;
                }
            }
        }
        return arr1;
    }
}