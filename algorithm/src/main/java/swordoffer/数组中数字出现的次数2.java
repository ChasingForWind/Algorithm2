package swordoffer;

/**
 * @Classname 数组中数字出现的次数2
 * @Description TODO
 * @Date 2022/6/29 08:01
 * @Created by liuchang
 */
public class 数组中数字出现的次数2 {
    public int singleNumber(int[] nums) {
        int[] k = new int[32];
        for (int n : nums){
            for (int i = 0; i < 31; i++) {
                if ((n&1)==1){
                    k[i]++;
                }
                n=n>>1;
            }
        }

        int res = 0;

        for (int j = 0; j < 31; j++) {
            if (k[j]%3==1){
                res = res + (int) Math.pow(2,j);
            }
        }

        return res;
    }
}
