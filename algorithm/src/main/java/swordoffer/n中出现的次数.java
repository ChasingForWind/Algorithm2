package swordoffer;

/**
 * @Classname n中出现的次数
 * @Description TODO
 * @Date 2022/7/12 07:44
 * @Created by liuchang
 */
public class n中出现的次数 {
    public int countDigitOne(int n) {
        int digit = 1;
        int res = 0;
        int cur = n%10;
        int high = n/10;
        int low = 0;
        while (high!=0||cur!=0){
            if (cur==0){
                res += high*digit;
            }else if (cur == 1){
                res += high*digit + low + 1;
            }else {
                res += (high+1)*digit;
            }
            low = low + cur*digit;
            cur = high%10;
            high = high/10;
            digit = digit * 10;
        }
        return res;
    }
}
