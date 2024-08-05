class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(String str : arr) {
            if(set.contains(str))
                list.remove(str);
            else {
                set.add(str);
                list.add(str);
            }
        }
        return (list.size() < k) ? "" : list.get(k - 1);
    }
}