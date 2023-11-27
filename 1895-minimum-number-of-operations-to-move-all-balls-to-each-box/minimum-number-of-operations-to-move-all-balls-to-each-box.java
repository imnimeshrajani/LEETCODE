class Solution {
    public int[] minOperations(String boxes) {
        char[] box = boxes.toCharArray();
        int[] ans = new int[box.length];
        for(int i = 0; i < box.length; i++) 
            for(int j = 0; j < box.length; j++) 
                if(i != j && box[j] == '1')
                    ans[i] += Math.abs(j-i);
        return ans;
    }
}