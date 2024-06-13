class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int[] freq = new int[100];
        for (int position : seats) 
            freq[position - 1]++;

        for (int position : students) 
            freq[position - 1]--;
        
        int moves = 0, unmatched = 0;
        for (int i : freq) {
            moves += Math.abs(unmatched);
            unmatched += i;
        }
        return moves;
    }
}