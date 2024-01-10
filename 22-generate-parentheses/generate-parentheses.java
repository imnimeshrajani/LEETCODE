class Solution {
    public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();

		helper(list, new StringBuilder("("), n - 1, n);
		return list;
	}

	public static void helper(List<String> list, StringBuilder sb, int open, int close) {
		if (open == 0 && close == 0) {
			list.add(sb.toString());
		}

		if (open != 0 && close != 0 && open <= close) {
			helper(list, sb.append('('), open - 1, close);
			sb.setLength(sb.length() - 1);
		}

		if (close != 0) {
			helper(list, sb.append(')'), open, close - 1);
			sb.setLength(sb.length() - 1);
		}
	}
}