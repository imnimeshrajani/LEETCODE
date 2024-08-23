import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public String fractionAddition(String expression) {
        // String[] parts = expression.split("(?=[+-])");
        // System.out.print(Arrays.toString(parts));
        int num = 0, den = 1;
        Pattern pattern = Pattern.compile("([+-]?\\d+)/(\\d+)");
        Matcher matcher = pattern.matcher(expression);
        
        while (matcher.find()) {
            int number1 = Integer.parseInt(matcher.group(1));
            int number2 = Integer.parseInt(matcher.group(2));
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