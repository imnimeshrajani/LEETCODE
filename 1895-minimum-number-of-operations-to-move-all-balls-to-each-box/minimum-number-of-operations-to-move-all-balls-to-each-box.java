class Solution {
    public int[] minOperations(String boxes) {
        int count = 0,operations = 0;
        char[] box = boxes.toCharArray();
        int ans[] = new int[box.length];
        for (int i=0;i<box.length;i++) {  
            ans[i] += operations;
            if(box[i] == '1') count++;
            operations+=count;
        }
        count = 0;
        operations = 0;
        for (int i = box.length - 1; i >= 0; i--) {
            ans[i]+=operations;
            if(box[i]=='1') count++;
            operations += count;
        }
    return ans;
    }
}