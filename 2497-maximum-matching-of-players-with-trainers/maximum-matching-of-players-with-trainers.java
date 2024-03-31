class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int ans = 0;
        for(int i = players.length - 1, j = trainers.length - 1; i >= 0 && j >= 0;) {
            if(players[i] <= trainers[j]) {
                ans++;
                j--;
                i--;
            } else if(j < trainers.length && players[i] > trainers[j]) i--;
        }
        return ans;
    }
}