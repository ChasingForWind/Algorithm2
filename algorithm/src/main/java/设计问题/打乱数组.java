package 设计问题;

import java.util.Arrays;
import java.util.Random;

public class 打乱数组 {

}

class Solution {
    int[] original;
    int[] newNums;

    public Solution(int[] nums) {
        original = Arrays.copyOfRange(nums,0,nums.length);
        newNums = Arrays.copyOfRange(nums,0,nums.length);
    }

    public int[] reset() {
        return original;
    }

    public int[] shuffle() {
        Random random = new Random();
        for (int i = 0; i < newNums.length; i++) {
            int j = i + random.nextInt(newNums.length-i);
            int temp = newNums[j];
            newNums[j] = newNums[i];
            newNums[i] = temp;
        }
        return newNums;
    }
}