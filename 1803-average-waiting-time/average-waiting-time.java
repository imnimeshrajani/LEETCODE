class Solution {
    public double averageWaitingTime(int[][] customers) {
        double waiting = 0;
        int time = 0;
        for(int[] arr : customers) {       
            time = (time < arr[0]) ? arr[0] + arr[1] : time + arr[1];
            waiting += time - arr[0];    
        }
        return waiting / customers.length;
    }
}