package leetcode;

/**
 * @Classname Leetcode374
 * @Description TODO
 * @Date 2022/5/23 08:01
 * @Created by liuchang
 */
public class Leetcode374 {

    public int guessNumber(int n) {
        int l=1;
        int r=n;
        int mid;
        while (l<=r){
            mid = (l+r)/2;
            if (guess(mid)==0){
                return mid;
            }else if (guess(mid)==1){
                l=mid+1;
            }else {
                r = mid-1;
            }
        }
        return -1;
    }

    int guess(int num){
        return 0;
    }

    public static void main(String[] args) {

    }
}
