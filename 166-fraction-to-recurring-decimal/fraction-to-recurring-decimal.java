class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder ans = new StringBuilder();
        if((numerator > 0) != (denominator > 0)) ans.append("-");

        long num = Math.abs((long) numerator), deno = Math.abs((long) denominator);
        long divided = num / deno, remains = num % deno;
        ans.append(divided);

        if(remains == 0) return ans.toString();
        else {
            ans.append(".");
            HashMap<Long, Integer> map = new HashMap<>();
            while(remains != 0){
                if(map.containsKey(remains)) {
                    ans.insert(map.get(remains), "(");
                    ans.append(")");
                    break;
                } 
                else {
                    map.put(remains, ans.length());
                    remains *= 10;
                    divided = remains / deno;
                    remains = remains % deno;
                    ans.append(divided);
                }
            }
        }

        return ans.toString();
    }
}