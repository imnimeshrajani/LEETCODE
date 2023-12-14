class Solution {
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> mainAns = new ArrayList();
        List<Integer> ans = new ArrayList();
        subSets(nums, 0, ans, mainAns);
        return mainAns;
    }

    public void subSets(int[] nums, int index, List<Integer> list, List<List<Integer>> ans) {
        if(index == nums.length) {
            List<Integer> temp = new ArrayList(list);
            Collections.sort(temp);
            if(!ans.contains(temp))ans.add(new ArrayList(temp));
            return; 
        }
        subSets(nums,index+1, list, ans);
        list.add(nums[index]);
        subSets(nums,index+1, list, ans);
        list.remove(list.size()-1);
    }
}