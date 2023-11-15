class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        // ArrayList<Integer> list = new ArrayList<>();
        // int min = 1;
        // for(int i = 0; i<arr.length; i++){
        //     if(min==arr[i]){
        //         list.add(i);
        //     }
        // }
        // for(int i = 0; i<list.size(); i++) {
        //     arr[i] = arr[i] ^ arr[list.get(i)];
        //     arr[list.get(i)] = arr[i] ^ arr[list.get(i)];
        //     arr[i] = arr[i] ^ arr[list.get(i)];
        // }
        Arrays.sort(arr);
        if(arr[0]!=1) arr[0] = 1;
        for(int i = 0; i<arr.length-1; i++)
            if((arr[i+1] - arr[i]) > 1) arr[i+1] = arr[i]+1;
        return arr[arr.length-1];
    }
}