class Solution {
    public int kthFactor(int n, int k) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i * i <= n; i++)  {
            if(n % i == 0) {
                if( i * i != n) list.add(n / i);
                if(++count == k) return i;
            }
        }
        return (list.size() + count < k) ? -1 : list.get(list.size() - (k - count));
    }
}