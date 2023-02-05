package leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Classname Leetcode448
 * @Description TODO
 * @Date 2022/5/19 07:50
 * @Created by liuchang
 */
public class Leetcode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= nums.length; i++) {
            set.add(i);
        }
        for (int num : nums) {
            set.remove(num);
        }

        return new ArrayList<>(set);
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i+1 && nums[nums[i]-1]!=nums[i]){
                int x = nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[x];
                nums[x] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
                arr.add(i+1);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = new Leetcode448().findDisappearedNumbers2(nums);
        System.out.println(list);
    }


}
