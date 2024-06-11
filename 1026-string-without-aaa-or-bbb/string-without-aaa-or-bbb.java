class Solution {
    public String strWithout3a3b(int a, int b) {
        int contiguousA = 0, contiguousB = 0, n = a + b;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(a >= b && contiguousA < 2 || contiguousB == 2 && a > 0) {
                ans.append("a");
                a--;
                contiguousA++;
                contiguousB = 0;
            } else if(b >= a && contiguousB < 2 || contiguousA == 2 && b > 0) {
                ans.append("b");
                b--;
                contiguousB++;
                contiguousA = 0;
            }
        }
        return ans.toString();
    }
}