class Solution {
    public String frequencySort(String s) {
        int[][] freq = new int[128][2];

        for (int i = 0; i < 128; i++)
            freq[i][0] = i;

        for (var c : s.toCharArray())
            freq[c][1]++;

        Arrays.sort(freq, (a, b) -> Integer.compare(b[1], a[1]));

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 128; i++)
            while (freq[i][1]-- > 0)
                ans.append((char) freq[i][0]);

        return ans.toString();
    }
}