class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> groups = new HashMap<>();
        for (int person = 0; person < groupSizes.length; person++) {
            int size = groupSizes[person];
            addToGroup(size, person, groups, result);
        }
        return result;
    }

    public void addToGroup(int size, int person, HashMap<Integer, List<Integer>> groups, List<List<Integer>> result) {
        List<Integer> group = groups.get(size);            
        if (group == null) {
            group = new ArrayList<Integer>();
            groups.put(size, group);
        }

        group.add(person);

        if (group.size() == size) {
            groups.remove(size);
            result.add(group);
        }
    }
}