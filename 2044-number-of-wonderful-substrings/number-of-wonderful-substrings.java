class Solution {
    public long wonderfulSubstrings(String word) {
        // long[] count = new long[1024];
        // long result = 0;
        // int prefixXor = 0;
        // count[prefixXor] = 1;

        // for (char ch : word.toCharArray()) {
        //     int charIndex = ch - 'a';
        //     prefixXor ^= 1 << charIndex;
        //     result += count[prefixXor];
        //     for (int i = 0; i < 10; i++) {
        //         result += count[prefixXor ^ (1 << i)];
        //     }
        //     count[prefixXor]++;
        // }

        // return result;

        long wonderful = 0;
        final int TOTAL = 1 << 10;
        long[] map = new long[TOTAL];
        map[0] = 1L;
        int value = 0;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            value ^= (1 << index);
            map[value]++;
        }
        for (int i = 0; i < TOTAL; i++) {
            wonderful += map[i] * (map[i] - 1) / 2;
            for (int j = 1; j <= i; j <<= 1) 
                if ((i & j) == j)
                    wonderful += map[i] * map[i - j];
        }
        return wonderful;
    }
}