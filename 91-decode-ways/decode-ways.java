class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') return 0;

        int n = s.length();
        int[] arr = new int[n + 1];
        arr[0] = arr[1] = 1;

        for (int i = 2; i <= n; ++i) {
            int oneDigit = s.charAt(i - 1) - '0';
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
            if (oneDigit != 0) arr[i] += arr[i - 1];
            if (10 <= twoDigits && twoDigits <= 26) arr[i] += arr[i - 2];
        }

        return arr[n];
    }
}