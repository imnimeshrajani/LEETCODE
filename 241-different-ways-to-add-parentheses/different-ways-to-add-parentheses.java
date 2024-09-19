class Solution {
    Map<String, List<Integer>> map = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        if(map.containsKey(expression)) 
            return map.get(expression);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i)), right = diffWaysToCompute(expression.substring(i + 1));
                for(int l : left) 
                    for(int r : right) 
                        list.add((ch == '+') ? l + r : (ch == '-') ? l - r : l * r);
            }
        }
        if(list.isEmpty())
            list.add(Integer.parseInt(expression));
        
        map.put(expression, list);
        return list;
    }
}