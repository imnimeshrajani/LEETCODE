class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m * k > bloomDay.length) return -1;
        int ans = -1, min = 0, max = Integer.MIN_VALUE;
        for(int i : bloomDay) 
            max = Math.max(max, i);
        
        while(min <= max) {
            int mid = min + (max - min) / 2, boques = 0, count = 0;
            for(int i=0; i<bloomDay.length; i++){
                while(i != bloomDay.length && bloomDay[i] <= mid){
                    count++;
                    i++;
                }
                boques+= count / k;
                count = 0;
            }
            if(boques >= m) {
                ans = mid; 
                max = mid - 1;
            } else min = mid + 1;
        }
        return ans;
    }
    
}