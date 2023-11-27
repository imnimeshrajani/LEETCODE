class Solution {
    public List<Integer> partitionLabels(String s) {
        char[] arr = s.toCharArray();
        List<Integer> ans = new ArrayList<>();
        int i = 0, j = s.length()-1, k = 0, start = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(i <= j){
            while(j > k && arr[j] != arr[i]) j--;
            while(i < j && map.containsKey(arr[i])) i++;
            map.put(arr[i], 0);
            if(i == j) {
                ans.add(j - start + 1);
                start = ++i;
            }
            k = j;
            j = arr.length - 1;
        }
        return ans;
    }
}