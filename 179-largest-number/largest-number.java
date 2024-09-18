class Solution {
    public String largestNumber(int[] nums) {
        String[] sb = new String[nums.length];
        for(int i = 0; i < nums.length; i++) 
            sb[i] = String.valueOf(nums[i]);
            
        Arrays.sort(sb, new Comparator<String>() {
            public int compare(String i, String j) {
                String s1 = i+j;
                String s2 = j+i;
                return s1.compareTo(s2);
            }
        });

        StringBuilder ans = new StringBuilder();
        if(sb[sb.length - 1].charAt(0) == '0') return "0";
        for(int i = sb.length - 1; i >= 0; i--) 
            ans.append(sb[i]);
        return ans.toString();
    }
}