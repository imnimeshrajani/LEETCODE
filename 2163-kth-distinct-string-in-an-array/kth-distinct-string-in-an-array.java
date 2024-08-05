class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>(), nonDistinctSet = new HashSet<>();
        for(String str : arr) {
            if(!nonDistinctSet.contains(str)) {
                if(set.contains(str)) {
                    list.remove(str);
                    nonDistinctSet.add(str);
                } else {
                    set.add(str);
                    list.add(str);
                }
            }
        }
        return (list.size() < k) ? "" : list.get(k - 1);
    }
}