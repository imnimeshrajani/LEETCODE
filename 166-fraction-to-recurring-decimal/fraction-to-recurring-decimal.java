class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder ans = new StringBuilder();
        ans.append(((numerator>0) ^ (denominator>0)) ? "-" : "");

        long num = Math.abs((long)numerator), deno = Math.abs((long)denominator);
        long afterDiv = num/deno, remains = num%deno;
        ans.append(afterDiv);

        if(remains==0) return ans.toString();
        else {
            ans.append(".");
            HashMap<Long, Integer> map = new HashMap<>();
            while(remains!=0){
                if(map.containsKey(remains)) {
                    ans.insert(map.get(remains), "(");
                    ans.append(")");
                    break;
                } 
                else {
                    map.put(remains, ans.length());
                    remains *= 10;
                    afterDiv = remains/deno;
                    remains = remains%deno;
                    ans.append(afterDiv);
                }
            }
        }

        return ans.toString();
    }
}