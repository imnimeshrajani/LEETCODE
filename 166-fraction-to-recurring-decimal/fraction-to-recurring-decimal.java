class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder ans = new StringBuilder();
        if((numerator > 0) != (denominator > 0)) ans.append("-");

        long num = Math.abs((long) numerator), deno = Math.abs((long) denominator);
        long divided = num / deno, module = num % deno;
        ans.append(divided);

        if(module == 0) return ans.toString();
        else {
            HashMap<Long, Integer> map = new HashMap<>();
            ans.append(".");
            while(module != 0){
                if(map.containsKey(module)) {
                    ans.insert(map.get(module), "(");
                    ans.append(")");
                    break;
                } 
                else {
                    map.put(module, ans.length());
                    module *= 10;
                    divided = module / deno;
                    module = module % deno;
                    ans.append(divided);
                }
            }
        }

        return ans.toString();
    }
}