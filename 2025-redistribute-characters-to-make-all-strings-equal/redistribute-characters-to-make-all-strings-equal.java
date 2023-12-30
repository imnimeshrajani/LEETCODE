class Solution {
    public boolean makeEqual(String[] words) {
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