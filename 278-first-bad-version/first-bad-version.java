/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(!isBadVersion(n)) return n;
        int start = 0, end = n;
        while(start < end) {
            int mid  = start + (end - start) / 2;
            boolean result = isBadVersion(mid);
            if(result) end = mid;
            else start = mid+1;
        }
        return start;
    }
}