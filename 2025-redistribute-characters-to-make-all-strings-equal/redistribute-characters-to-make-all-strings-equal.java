class Solution {
    public boolean makeEqual(String[] words) {
        int totalCount = 0, n = words.length, arr[] = new int[26];
		for (String s : words) totalCount += s.length();
		if (totalCount % n != 0) return false;
		for (String s : words) for (char c : s.toCharArray()) arr[c - 'a']++;
		for (int count : arr) if (count % n != 0) return false;
		return true; 
    }
}