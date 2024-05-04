class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length - 1, start = 0, end = n, ans = 0;
        while(people[end] == limit) {
            end--;
            ans++;
        }
        while(start <= end) {
            if(people[start] + people[end] <= limit) 
                start++;
            end--;
            ans++;
        }
        return ans;
    }
}