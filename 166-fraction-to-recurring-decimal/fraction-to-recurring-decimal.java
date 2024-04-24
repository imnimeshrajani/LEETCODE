class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder ans = new StringBuilder();
        ans.append(((numerator>0) ^ (denominator>0)) ? "-" : "");
        long num = Math.abs((long)numerator);
        long deno = Math.abs((long)denominator);

        long quotient = num/deno;
        long rem = num%deno;
        ans.append(quotient);

        if(rem==0) return ans.toString();
        else{
            ans.append(".");

            HashMap<Long, Integer> map = new HashMap<>();
            while(rem!=0){

                if(map.containsKey(rem)){
                    int temp = map.get(rem);
                    ans.insert(temp, "(");
                    ans.append(")");
                    break;
                } 
                else{
                    map.put(rem, ans.length());

                    rem *= 10;
                    quotient = rem/deno;
                    rem = rem%deno;
                    ans.append(quotient);
                }
            }
        }

        return ans.toString();
    }
}