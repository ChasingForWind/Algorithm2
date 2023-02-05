package leetcode;

/**
 * @Classname Leetcode69
 * @Description 开方
 * @Date 2021/4/12 10:17 下午
 * @Created by liuchang
 */
public class Leetcode69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        //特殊情况 0
        if(x==0){
            return x;
        }
        //定义循环变量
        int l = 1;
        int r = x;
        int mid;
        int sqr;
        //开始循环
        while (l<=r){
            mid = l + (r-l)/2;
            sqr = x/mid;
            if (sqr==mid){
                return sqr;
            }else if(sqr<mid){
                r = mid-1;
            }else {
                l = mid+1;
            }
        }

        //返回
        return r;
    }
}
