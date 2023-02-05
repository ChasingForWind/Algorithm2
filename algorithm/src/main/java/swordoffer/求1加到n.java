package swordoffer;

/**
 * @Classname 求1加到n
 * @Description TODO
 * @Date 2022/6/23 08:32
 * @Created by liuchang
 */
public class 求1加到n {
    public int sumNums(int n) {
        if (n<=0){
            return 0;
        }
        return n+sumNums(n-1);
    }
}
