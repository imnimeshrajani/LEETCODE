class Solution {
    public int findSpecialInteger(int[] arr) {
        int checkPoint = arr.length / 4;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[i + checkPoint]) return arr[i];
        }
        return arr[0];
    }
}