class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int chance = 2;
        char arr1[] = s1.toCharArray(), arr2[] = s2.toCharArray(), A1 = ' ', A2 = ' ', B1 = ' ', B2 = ' ';
        for(int i = 0; i < s1.length(); i++) {
            if(arr1[i] == arr2[i]) continue;
            if(chance == 0) return false;
            if(A1 == ' ') A1 = arr1[i];
            else A2 = arr1[i];
            if(B1 == ' ') B1 = arr2[i];
            else B2 = arr2[i];
            chance--;
        }
        return A1 == B2 && A2 == B1;
    }
}