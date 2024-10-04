class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length, freq[] = new int[1001], total = 0;
        for(int i : skill) {
            total += i;
            freq[i]++;
        } 
        int requiredSkill = total / (n / 2);
        long chemistry = 0;
        if(total % (n / 2) != 0) return -1;
        for(int val : skill) {
            int remaining = requiredSkill - val;
            if(freq[remaining] == 0) return -1;
            chemistry += (long) (val * remaining);
            freq[remaining]--;
        }

        return chemistry / 2;
                
    }
}