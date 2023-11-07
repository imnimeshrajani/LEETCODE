class Solution {
    public int distMoney(int money, int children) {
        if(money < children) return -1;
        money -= children;
        int temp = money/7;
        int temp2 = money % 7;
        if(money < 7) return 0;
        if(temp == children && temp2 == 0) return children;
        else if(temp2 == 3 && children - temp == 1) return temp-1;
        else if(temp < children) {
            return temp;
        }else if(temp > children){
            return children-1;
        }else if (temp == children && temp2 > 0) return children-1;
       return children;
    }
}