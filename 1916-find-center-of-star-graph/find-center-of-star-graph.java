class Solution {
    public int findCenter(int[][] edges) {
        int freq[] = new int[edges.length + 2], max = 0, ans = 0;
        for(int[] i : edges) {
            freq[i[0]]++;
            freq[i[1]]++;
        } 
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > max) {
                max = freq[i];
                ans = i;
            }
        }
        return ans;
    }
}