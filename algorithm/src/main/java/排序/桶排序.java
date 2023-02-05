package 排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

/**
 * @Classname 桶排序
 * @Description TODO
 * @Date 2022/6/19 21:24
 * @Created by liuchang
 */
public class 桶排序 {
    public int[] sortArray(int[] nums) {
        move(nums,100000);

        // step1 构建桶
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

        int num = (max - min)/nums.length+1;
        int step = (max - min )/num + 1;
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            buckets.add(new ArrayList<>());
        }
        // step2 将值放入桶
        for (int j : nums) {
            int index = (j - min) / step;
            buckets.get(index).add(j);
        }

        // step3 桶排序
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // step4 将桶中数据倒出
        int k = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (Integer integer : bucket) {
                nums[k++] = integer;
            }
        }
        move(nums,-100000);
        return nums;
    }

    public void move(int[] arr,int pia){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + pia;
        }
    }

    public static void main(String[] args) {
        桶排序 test = new 桶排序();
        int[] arr = {-1,2,-8,-10};
        test.sortArray(arr);
    }
}
