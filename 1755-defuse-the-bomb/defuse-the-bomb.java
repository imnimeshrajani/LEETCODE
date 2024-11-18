class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k == 0) return new int[code.length];
        
        int[] pre = new int[code.length * 2 + 1];
        for(int i = 0; i < code.length * 2; i++)
            pre[i + 1] = pre[i] + code[i % code.length];
        
        for(int i = 0; i < code.length; i++) 
            code[i] = (k < 0) ? pre[i + code.length] - pre[i + k + code.length] : pre[i + k + 1] - pre[i + 1];
        
        return code;
    }
}