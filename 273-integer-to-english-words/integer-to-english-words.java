class Solution {
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        String[] numbers = new String[] {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
        return helper(num, 0, new StringBuilder(), numbers).toString().trim();
    }
    StringBuilder helper(int num, int stack, StringBuilder ans, String[] numbers) {
        if(num/1000 != 0) ans = helper(num / 1000, stack + 1, ans, numbers);
        int number = num % 1000;
        // System.out.println("On stack " + stack + " number is : " + number);
        if(number == 0) return ans;
        if(number / 100 != 0) {
            ans.append(numbers[number / 100]);
            ans.append("Hundred ");
            number %= 100;
        } 
        if(number / 10 != 0 && number / 10 > 1) {
            int val = number / 10;
            if(val == 2) ans.append("Twenty " + numbers[number % 10]);
            if(val == 3) ans.append("Thirty " + numbers[number % 10]);
            if(val == 4) ans.append("Forty " + numbers[number % 10]);
            if(val == 5) ans.append("Fifty " + numbers[number % 10]);
            if(val == 6) ans.append("Sixty " + numbers[number % 10]);
            if(val == 7) ans.append("Seventy " + numbers[number % 10]);
            if(val == 8) ans.append("Eighty " + numbers[number % 10]);
            if(val == 9) ans.append("Ninety " + numbers[number % 10]);
            number %= 10;
        } else {
            ans.append(numbers[number]);
        }
            if(stack == 3) ans.append("Billion ");
            else if(stack == 2) ans.append("Million ");
            else if(stack == 1) ans.append("Thousand ");
        
        
        // System.out.println(ans);
        return ans;
    }
}