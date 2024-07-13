class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Integer[] arr = new Integer[positions.length];
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack();
        for(int i = 0; i < positions.length; i++) arr[i] = i;
        Arrays.sort(arr, (a, b) -> Integer.compare(positions[a], positions[b]));
        for(int i : arr) {
            if(directions.charAt(i) == 'R') st.push(i);
            else {
                while(!st.isEmpty() && healths[i] > 0) {
                    int idx = st.pop();
                    if(healths[idx] > healths[i]) {
                        healths[idx]--;
                        healths[i] = 0;
                        st.push(idx);
                    } else if(healths[i] > healths[idx]) {
                        healths[i]--;
                        healths[idx] = 0;
                    } else 
                        healths[i] = healths[idx] = 0;
                }
            }
        }
        for(int i : healths) if(i > 0) ans.add(i);
        return ans;
    }
}