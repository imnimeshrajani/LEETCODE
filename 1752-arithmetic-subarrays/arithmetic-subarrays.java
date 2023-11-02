class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList();
        for(int i = 0; i<l.length; i++){
            int[] arr = new int[r[i]-l[i]+1];
            int index = 0;
            for(int j = l[i]; j <= r[i]; j++){
                arr[index++] = nums[j];
            }
            Arrays.sort(arr);
            int diff = arr[1] - arr[0];
            for(int k = 1; k<arr.length; k++){
                if(diff != arr[k]-arr[k-1]){
                    list.add(false);
                    break;
                } else if(k+1 == arr.length) {
                     list.add(true);
                }
            }
        }
        return list;
    }
}