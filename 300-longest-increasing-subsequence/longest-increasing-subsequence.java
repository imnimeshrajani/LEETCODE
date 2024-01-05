class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        int ans = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > list.get(list.size()-1)){
                list.add(nums[i]);
                ans++;
            }else list.set(binarySearch(list, nums[i]),nums[i]);
    
             
        }
        return ans;
        
    }
    static int binarySearch(ArrayList<Integer> ans, int key) {
        int start = 0, end = ans.size() - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (ans.get(mid) == key) return mid;
            else if (ans.get(mid) < key) start = mid + 1;
            else end = mid - 1;
        }
        return end + 1;
    }
}