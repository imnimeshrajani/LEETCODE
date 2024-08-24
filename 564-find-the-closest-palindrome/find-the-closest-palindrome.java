class Solution {
    public String nearestPalindromic(String n) {
        long number = Long.valueOf(n),ans = 0, minDiff = Long.MAX_VALUE, variations[] = new long[5];
        int size = n.length();
        if(number <= 11) return (number == 11) ? "9" : String.valueOf(number - 1);
        long leftSide = Long.valueOf(n.substring(0, (size + 1) / 2));
        variations[0] = helper(leftSide - 1, size % 2 == 0);
        variations[1] = helper(leftSide, size % 2 == 0);
        variations[2] = helper(leftSide + 1, size % 2 == 0);
        variations[3] = (long) Math.pow(10, size - 1) - 1;
        variations[4] = (long) Math.pow(10, size) + 1;

        for(long variant : variations) {
            if(variant != number) {
                long diff = Math.abs(variant - number);
                if(diff < minDiff || diff == minDiff && variant < ans) {
                    minDiff = diff;
                    ans = variant;
                }
            }
        }
        return String.valueOf(ans);
    }
    long helper(long number, boolean isEvenLength) {
        long palindrome = number;
        if(!isEvenLength) number /= 10;
        while(number > 0) {
            palindrome = palindrome * 10 + number % 10;
            number /= 10;
        }
        return palindrome;
    }
}