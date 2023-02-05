package swordoffer;

import java.util.LinkedList;

/**
 * @Classname 滑动窗口最大值
 * @Description TODO
 * @Date 2022/7/3 17:40
 * @Created by liuchang
 */
public class 滑动窗口最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||nums.length<=0){
            return new int[0];
        }
        int[] max = new int[nums.length-k+1];
        LinkedList<Integer> list = new LinkedList<>();
        int begin;
        for (int i = 0; i <= nums.length-1; i++) {
            begin = i - k + 1;

            if (list.isEmpty()){
                list.add(i);
            }else {
                if (begin>list.peekFirst()){
                    list.pollFirst();
                }

                while (!list.isEmpty()&&nums[list.peekLast()]<nums[i]){
                    list.pollLast();
                }
                list.add(i);
            }



            if (begin>=0&&!list.isEmpty()){
                max[begin] = nums[list.peekFirst()];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        滑动窗口最大值 test = new 滑动窗口最大值();
        int[] arr = {1,-1};
        test.maxSlidingWindow(arr,1);
    }
}
