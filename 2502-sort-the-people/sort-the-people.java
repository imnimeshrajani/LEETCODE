class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new TreeMap<>();
        String res[] = new String[names.length];
        for(int i=0; i<names.length; i++) map.put(heights[i],names[i]);
        int j = res.length-1;
        for(Map.Entry<Integer,String> m : map.entrySet())
            res[j--] = m.getValue();

        return res;
    }
}