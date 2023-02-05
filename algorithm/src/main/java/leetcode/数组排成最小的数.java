package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Classname 数组排成最小的数
 * @Description TODO
 * @Date 2022/6/7 08:02
 * @Created by liuchang
 */
public class 数组排成最小的数 {
    public String minNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(x,y)->(x+y).compareTo(y+x));
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }
}
