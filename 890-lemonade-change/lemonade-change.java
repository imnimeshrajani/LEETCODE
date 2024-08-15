class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        if (bills[0] > 5) return false;
        for (int val : bills) {
            if (val == 5) five++;
            else if (val == 10) {
                if (five == 0) return false;
                else {
                    five--;
                    ten++;
                }
            } else {
                if(ten > 0) {
                    ten--;
                    if(five > 0) five--;
                    else return false;
                } else {
                    if(five > 2) five -= 3;
                    else return false;
                }
            }
        }
        return true;
    }
}