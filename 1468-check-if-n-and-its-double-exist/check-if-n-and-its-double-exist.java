class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]%2 ==0 && map.containsValue(arr[i]/2)) || map.containsValue(arr[i]*2)){
                return true;
            } else {
                map.put(i, arr[i]);
            }
        }
        return false;
    }
}