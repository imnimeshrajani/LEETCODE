class Solution {
    public String fractionAddition(String expression) {
        String[] parts = expression.split("(?=[+-])");
        // System.out.print(Arrays.toString(parts));
        int num = 0, den = 1;
        for(String part : parts) {
            String[] numStr = part.split("/");
            int number1 = Integer.parseInt(numStr[0]), number2 = Integer.parseInt(numStr[1]);
            num = (num * number2) + (den * number1);
            den *= number2;
            int gcdValue = gcd(Math.abs(num), den);
            num /= gcdValue;
            den /= gcdValue;
        }

        return num + "/" + den;
    }
    int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}