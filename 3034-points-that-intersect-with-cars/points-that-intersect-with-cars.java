class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Collections.sort(nums, new Comparator<List<Integer>>(){
            public int compare(List<Integer> arg0, List<Integer> arg1) {
            return arg0.get(0).compareTo(arg1.get(0));
            }
        });
        int max = nums.get(0).get(1);
        int ans = nums.get(0).get(1)-nums.get(0).get(0) +1;
        for(int i = 1; i<nums.size(); i++){
            if(max >= nums.get(i).get(0) && max < nums.get(i).get(1)){
                    ans += nums.get(i).get(1) - max;
                    max = nums.get(i).get(1);
            } else if (max < nums.get(i).get(0)){
                    ans += nums.get(i).get(1) - nums.get(i).get(0)+1;
                    max = nums.get(i).get(1);
            }
        }
        return ans;
    }
}