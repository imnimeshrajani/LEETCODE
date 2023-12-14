class Solution {
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> mainAns = new ArrayList();
        List<Integer> ans = new ArrayList();
        mainAns.add(new ArrayList<>());
        subSets(nums, 0, ans, mainAns);
        return mainAns;
    }

    public void subSets(int[] nums, int index, List<Integer> list, List<List<Integer>> ans) {
        if(index == nums.length) {
            
            if(!ans.contains(list))ans.add(new ArrayList(list));
            return; 
        }
        subSets(nums,index+1, list, ans);
        list.add(nums[index]);
        subSets(nums,index+1, list, ans);
        list.remove(list.size()-1);
    }
}