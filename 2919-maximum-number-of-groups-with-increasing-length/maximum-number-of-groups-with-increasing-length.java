class Solution {
    public int maxIncreasingGroups(List<Integer> list) {
        Collections.sort(list);
        long sum = 0, ans =0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
            if(sum >= ((ans+1)*(ans+2))/2) ans++;
        }
        return (int)ans;
    }
}