class Solution {
    public int countGoodSubstrings(String s) {
        int[] arr = new int[256];

        int start = 0,  end = 0, unique = 0, ans = 0;
        char[] ch = s.toCharArray();
    
        while(end < s.length()) {
            char cEnd = ch[end], cStart = ch[start];
            if(arr[cEnd] == 0) unique++;
            arr[cEnd]++;

            if(end - start == 3){
                if(arr[cStart] == 1) unique--;
                arr[cStart]--;
                start++;
            }

            if(unique == 3) {
                ans++;
                // System.out.println("unique: " + unique);
            }
            end++;
            

            // System.out.println(Arrays.toString(arr));
        }
        return ans;
    }
}