class Solution {
    public int compareVersion(String version1, String version2) {
        char[] v1 = version1.toCharArray(), v2 = version2.toCharArray(); 
        int idx1 = 0, idx2 = 0;
        while(true) {
            int prev1 = idx1, prev2 = idx2;
            while(idx1 < v1.length && v1[idx1] != '.') idx1++;
            int val1 = idx1 <= v1.length ? Integer.parseInt(version1.substring(prev1, idx1++)) : 0;
            while(idx2 < v2.length && v2[idx2] != '.') idx2++;
            int val2 = idx2 <= v2.length ? Integer.parseInt(version2.substring(prev2, idx2++)) : 0;
            System.out.println(val1 + " " + val2);
            if(val1 > val2) return 1;
            if(val1 < val2) return -1;
            if(idx1 >= v1.length && idx2 >= v2.length) break;
        }
        return 0;
    }
}