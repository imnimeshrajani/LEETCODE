class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int max = Integer.MIN_VALUE;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(0,0);
        for(int[] item : items) {
            if (item[1] <= max) 
                continue;
            
            max =  item[1];
            map.put(item[0], max);
        }
        int[] ans = new int[queries.length];
        for(int i = 0; i < ans.length; i++) 
            ans[i] = map.floorEntry(queries[i]).getValue();
        
        return ans;
    }
}