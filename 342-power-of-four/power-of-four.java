class Solution {
    public boolean isPowerOfFour(int n) {
        //Bit Manipulations
        for(int i = 0; i < (1<<i)&& i < 32; i+=2)  if((1<<i) == n) return true;
        return false;

        // Math
        // if(n == 0)  return false;
        // while (n != 1) {
        //     if(n % 4 != 0) return false;
        //     n/=4;
        // }
        // return true;

        // Recursion
        // if(n==1) return true;
        // if(n % 4 != 0 || n == 0) return false;
        // return isPowerOfFour(n/4);
    }
}