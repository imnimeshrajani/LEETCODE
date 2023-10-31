class Solution {
    public boolean isHappy(int n) {
        while(n>=7) {
            int sum = 0;
            while(n>0) {
                sum += (n%10)*(n%10);
                n /= 10;
            }
            n = sum;
            if(n==8 || n == 9) return false;
        }
        return (n==1)? true : false;
    }
}