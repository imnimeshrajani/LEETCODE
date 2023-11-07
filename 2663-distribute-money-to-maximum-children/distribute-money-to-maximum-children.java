class Solution {
    public int distMoney(int money, int children) {
        int count = 0;
        if(money < children) return -1;
        if(money == children) return 0;
        for(int i = 0; i<children; i++) money--;
        if(money<7) return 0;
        while(money>=7 && children>1){
            money-=7;
            children--;
            count++;
        }
        if(money == 3 && children > 1) return count;
        if(money == 3 && children == 1) return count-1;
        if(money == 7 && children == 1) return count+1;
        return count;
    }
}