class Solution {
    public String countOfAtoms(String formula) {
        Map<String, Integer> map = new TreeMap<>();
        StringBuilder newFormula = new StringBuilder();
        Stack<Integer> st = new Stack();
        char[] arr = formula.toCharArray();
        int i = arr.length - 1, multi = 1;
        while(i >= 0) {
            if(arr[i] == '(') {
                multi /= st.pop();
                i--;
                continue;
            }
            int end = i, val = 1;
            if(Character.isDigit(arr[i])) {
                while(Character.isDigit(arr[i])) i--;
                val = Integer.parseInt(formula.substring(i + 1, end + 1));
            }
            st.push(val);
            multi *= val;
            end  = i;
            if(Character.isLetter(arr[i])) {
                while(Character.isLowerCase(arr[i])) i--;
                String str = formula.substring(i, end + 1);
                map.put(str, map.getOrDefault(str, 0) + multi);
                multi /= st.pop();
            }
            i--;
        }   
        for(var m : map.entrySet()) {
            newFormula.append(m.getKey());
            if(m.getValue() > 1) newFormula.append(m.getValue());
        }
        return newFormula.toString();
    }
}