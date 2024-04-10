class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int ans[] = new int[deck.length], index = 0;
        Queue<Integer> q  = new LinkedList();
        for(int i = 0; i < deck.length; i++) 
            q.add(i);
        while(q.size() > 1) {
            ans[q.poll()] = deck[index++];
            q.add(q.poll());
        }
        ans[q.poll()] = deck[index];
        return ans;
    }
}