class Solution {
    public int differenceOfSums(int n, int m) {
        int totalSum = n*(n+1)/2;
        int lastValue = n - (n % m);
        int divSum = (lastValue/m * (lastValue/m +1))/2 * m;
        return totalSum - (divSum*2);
    }
}