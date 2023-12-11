class Solution {
    public int findSpecialInteger(int[] A) {
        int i = 0, cp = A.length / 4;
        while (A[i] != A[i + cp]) i++;
        return A[i];
    }
}