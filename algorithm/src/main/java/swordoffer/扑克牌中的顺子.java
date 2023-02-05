package swordoffer;

import java.util.Arrays;

/**
 * @Classname 扑克牌中的顺子
 * @Description TODO
 * @Date 2022/6/7 08:10
 * @Created by liuchang
 */
public class 扑克牌中的顺子 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int jokes = 0;
        for (int i = 0; i < 5; i++) {
            if (nums[i]==0) {
                jokes++;
            }else if (nums[i]==nums[i+1]){
                return false;
            }
        }
        return nums[4]-nums[jokes]<5;
    }
}
