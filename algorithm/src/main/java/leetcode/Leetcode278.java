package leetcode;

/**
 * @Classname Leetcode278
 * @Description TODO
 * @Date 2022/5/25 08:17
 * @Created by liuchang
 */
public class Leetcode278 {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    public boolean isBadVersion(int n){
        return true;
    }
}
