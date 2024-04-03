class Solution {
    public int thirdMax(int[] nums) {
        Integer first = null, sec = null, third = null;
        for (Integer i : nums) {
            if (i.equals(first) || i.equals(sec) || i.equals(third)) continue;
            if (first == null || i > first) {
                third = sec;
                sec = first;
                first = i;
            } else if (sec == null || i > sec) {
                third = sec;
                sec = i;
            } else if (third == null || i > third) {
                third = i;
            }
        }
        return third == null ? first : third;
    }
}