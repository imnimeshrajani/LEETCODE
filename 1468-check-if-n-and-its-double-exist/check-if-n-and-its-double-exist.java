class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Double, Double> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsValue((double)arr[i]/2) || map.containsValue((double)arr[i]*2)){
                return true;
            } else {
                map.put((double) i, (double) arr[i]);
            }
        }
        return false;
    }
}