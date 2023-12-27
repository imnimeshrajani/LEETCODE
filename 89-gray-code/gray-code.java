class Solution {
    public List<Integer> grayCode(int n) {
        var list = new ArrayList();
        for(var i = 0; i < (1<<n); i++) list.add(i ^ (i>>1));
        return list;
    }
}