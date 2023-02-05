package swordoffer;

/**
 * @Classname 数组中数字出现的次数1
 * @Description TODO
 * @Date 2022/6/29 07:43
 * @Created by liuchang
 */
public class 数组中数字出现的次数1 {
    public int[] singleNumbers(int[] nums) {
        int help = nums[0];
        for (int n : nums){
            help = help^n;
        }
        int dev = 1;
        while ((dev&help)!=0){
            dev = dev<<1;
        }
        int a = 0;
        int b = 0;
        for(int n : nums){
            if ((n&dev)==0){
                a = a^n;
            }else {
                b = b^n;
            }
        }

        int[] res = new int[2];

        res[0] = a;
        res[1] = b;

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,2};
        数组中数字出现的次数1 test = new 数组中数字出现的次数1();
        test.singleNumbers(arr);
    }
}
