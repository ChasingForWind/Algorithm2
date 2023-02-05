package 算法初级.数组;

/**
 * @Classname 只出现一次的数字
 * @Description TODO
 * @Date 2022/7/19 07:56
 * @Created by liuchang
 */
public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int result =0;
        for (int num : nums) {
            result = num ^ result;
        }
        return result;
    }
}
