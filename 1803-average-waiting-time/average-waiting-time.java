class Solution {
    public double averageWaitingTime(int[][] customers) {
        long waiting = 0;
        int time = 0;
        for(int[] arr : customers) {       
            if(time < arr[0]) 
                time = arr[0];
            waiting += time + arr[1] - arr[0];    
            time += arr[1];
            
        }
        return (double) waiting / customers.length;
    }
}