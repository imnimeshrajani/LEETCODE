class Solution {
    public String frequencySort(String s) {
        char[] ch = s.toCharArray();
        int[] freq = new int[128];
        for (int i : ch)
            freq[i]++;
        for (int i = 0; i < ch.length;) {
            char cmax = ',';
            for (int j = 0; j < 128; j++) {
                if (freq[j] > freq[cmax])
                    cmax = (char) j;
            }
            while (freq[cmax] != 0) {
                ch[i++] = cmax;
                freq[cmax]--;
            }
        }
        return new String(ch);
    }
}