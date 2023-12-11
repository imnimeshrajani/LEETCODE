class Solution {
    public int findSpecialInteger(int[] arr) {
        int i = 0, checkPoint = arr.length / 4;
        while (arr[i] != arr[i + checkPoint]) i++;
        return arr[i];
    }
}