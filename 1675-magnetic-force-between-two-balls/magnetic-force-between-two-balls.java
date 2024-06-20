class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start = 1, end = (position[position.length - 1] - position[0]) / (m - 1), ans = 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(canSet(position, mid) >= m) {
                ans = mid;
                start = ++mid;
            } else end = --mid;
        }
        return ans;
    }
    int canSet(int[] arr, int distance) {
        int count = 1, last = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] - last >= distance) {
                count++;
                last = arr[i];
            }
        }
        return count;
    }
}