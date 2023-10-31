class Solution {
    public int lastStoneWeight(int[] stones) {
        int largest = Integer.MIN_VALUE, secLargest = -1;
        if(stones.length == 1) return stones[0];
        while(secLargest !=0){
            secLargest = 0;
            largest = Integer.MIN_VALUE;
            int lIndex = 0, slIndex = 0;
            for(int j = 0; j<stones.length; j++) { 
                if(stones[j]>largest) {
                    secLargest = largest;
                    slIndex = lIndex;
                    largest = stones[j];
                    lIndex = j;
                } else if (stones[j]>secLargest) {
                    secLargest = stones[j];
                    slIndex = j;
                }
            }
            stones[slIndex] = 0;
            stones[lIndex] = largest - secLargest;

        }
        return largest;
    }
}