class Solution {
    int min = Integer.MAX_VALUE;
    public int minimumOneBitOperations(int n) {
        if (n <= 1) return n;
        int count = 0;
        while ((1<<count) <= n) count++;
        return ((1<<count)-1) - minimumOneBitOperations(n-(1<<(count-1)));
    //     if(n == 1) return n;
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int count = 0, ans = 0;
    //     while(n != 0) {
    //         int temp = n % 2;
    //         n /= 2;
    //         if(temp == 1) count++;
    //         list.add(temp);
    //     }
        
    //     int lastPos = list.get(list.size()-1);
    //     System.out.println(list);
    //     if(lastPos == 1) {
    //         list.set(list.size()-1, 0);
    //         count--;
    //         ans++;
    //     }
    //     while(count!=0) {
    //         int index = lastPos;
    //         if(list.get(lastPos) == 1){
    //             if(list.get(index - 1) == 0){
    //                 list.set(index-1, 1);
    //                 count++;
    //             } else {
    //                 list.set(index-1, 0);
    //                 count--;
    //             }
    //             list.set(lastPos,0);
    //             ans+=2;
    //             count--;
    //         } else {
    //             while(index>0 && list.get(index)!=1) index--;
    //             if(index!=0){
    //                 if(list.get(index - 1) == 0){
    //                     list.set(index-1, 1);
    //                     count++;
    //                 } else {
    //                     list.set(index-1, 0);
    //                     count--;
    //                 }
    //                 ans++;
    //             }
    //             list.set(lastPos, 1);
    //             ans++;
    //             count++;
    //         }
    //     }
        
    //  return ans;   
    }
}