class Solution {
    public String removeDigit(String number, char digit) {
        String max = "";
        for(int i = 0; i<number.length();i++){
            if(number.charAt(i) == digit){
                String newNum = number.substring(0,i)+number.substring(i+1);
                if(newNum.compareTo(max)>0) max = newNum;
            }
        }
        return max;
    }
}