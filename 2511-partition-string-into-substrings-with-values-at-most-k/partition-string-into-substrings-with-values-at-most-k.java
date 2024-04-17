class Solution {
    public int minimumPartition(String s, int k) {
        // int ans = 0, left = 0, right = 0;
        // while(right < s.length()) {
        //     while(right < s.length() && Long.parseLong(s.substring(left,right + 1)) <= k) right++;
        //     ans++;
        //     if(left == right) return -1;
        //     left = right;
        // }
        // return ans;

        int n = s.length();
        int[] str = new int[n];
        for(int i=0; i<n; i++)
            str[i] = s.charAt(i)-'0';
        
        int p = 0;
        for(int i = 0; i < n; i++){
            long temp  = str[i]; 
            if(temp > k) return -1;
            int j = i + 1;
            while(j<n&&temp<=(long)k)
                temp = temp*(long)10+(long)str[j++];

            p++;
            if(temp <= (long)k) return p;
            i = (j == i + 1) ? j - 1 : j - 2;
            
        }
        return p;
    }
}