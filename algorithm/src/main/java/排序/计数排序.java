package 排序;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @Classname 计数排序
 * @Description TODO
 * @Date 2022/6/20 08:11
 * @Created by liuchang
 */
public class 计数排序 {
    public int[] sortArray(int[] nums) {
        // step1 寻找最大最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        OptionalInt maxOption = Arrays.stream(nums).max();
        OptionalInt minOption = Arrays.stream(nums).min();
        if (maxOption.isPresent()){
            max = maxOption.getAsInt();
        }
        if (minOption.isPresent()){
            min = minOption.getAsInt();
        }
        // step2 建立辅助数组
        int[] arr = new int[max - min + 1];

        // step3 遍历排序
        for (int num : nums) {
            int diff = num - min;
            arr[diff]++;
        }

        // step4 重新替换
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]!=0){
                nums[index++] = i + min;
                arr[i]--;
            }
        }
        return nums;
    }

}
