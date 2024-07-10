package rey.bos.first_bad_version;

public class Solution {

    public int firstBadVersion(int n) {
        if (n == 1) {
            return 1;
        }
        int start = 1;
        int badVersion = -1;
        while (start <= n) {
            int mid = start + (n - start) / 2;
            if (isBadVersion(mid)) {
                badVersion = mid;
                n = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return badVersion;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }

}
