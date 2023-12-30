class Solution {
    public boolean makeEqual(String[] words) {
        int totalCharCount = 0;
		for (String s : words) {
			totalCharCount += s.length();
		}
		if (totalCharCount % words.length != 0) {
			return false;
		}

		int[] arr = new int[26];
		for (String s : words) {
			for (char c : s.toCharArray()) {
				arr[c - 'a']++;
			}
		}
		for (int count : arr) if (count % words.length != 0) return false;
		return true; 
    }
}