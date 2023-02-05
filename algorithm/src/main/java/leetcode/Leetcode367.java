package leetcode;

/**
 * @Classname Leetcode367
 * @Description 完全平法数
 * @Date 2022/5/24 07:58
 * @Created by liuchang
 */
public class Leetcode367 {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long sqr = (long) mid * mid;
            if (sqr == num) {
                return true;
            } else if (sqr < num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}
