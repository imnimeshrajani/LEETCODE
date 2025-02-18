class Solution {
    public String smallestNumber(String pattern) {
        int size = pattern.length();
        char arr[] =  new char[size+1];
        for(int i=0;i<=size;i++){
            arr[i] = Character.forDigit(i+1, 10);
        }
        for(int i =0;i<size;i++){
            int temp = i;
            while(temp < size && pattern.charAt(temp) == 'D'){
                temp++;   
            }
            reverse(arr, i , temp);
            if(i!= temp ) i = temp-1;

        }

        return new String(arr);
    }
    public void reverse(char arr[] , int i  , int j){
            while(i < j){
                char temp = arr[i];
                arr[i++]= arr[j];
                arr[j--] = temp;
            }  

    }
    //     StringBuilder ans = new StringBuilder();
    //     for(int i = 1; i <= pattern.length() + 1; i++)
    //         ans.append(i);
    //     int i = 0, j = 0;
    //     while (j < pattern.length()) {
    //         if(pattern.charAt(j) == 'D') {
    //             i = j;
    //             while(j < pattern.length() && pattern.charAt(j) == 'D') j++;
    //         int temp = j;
    //         while(i < temp) {
    //             char s = ans.charAt(temp), e = ans.charAt(i);
    //             ans.setCharAt(i++, s);
    //             ans.setCharAt(temp--, e);
    //         }
    //         }
    //         else 
    //             j++;
            
    //     }
    //     System.out.println(ans.toString());
    //     return ans.toString();
    // }
}