package 滑动窗口与双指针;

public class 将X减到0的最小操作数 {
    public int minOperations(int[] nums, int x) {
        // 滑动窗口的值
        int sum = getSum(nums, 0, nums.length - 1);
        int target = sum - x;

        if (target == 0) {
            return nums.length;
        }

        // 辅助数字

        int fast = 0;
        int slow = 0;
        int max = 0;
        int windowSum = 0;

        // 开始滑动
        while (fast <= nums.length - 1) {
            windowSum += nums[fast];
            while (windowSum > target && slow <= fast) {
                windowSum -= nums[slow];
                slow++;
            }
            if (windowSum == target) {
                max = Math.max(max, fast - slow + 1);
            }
            fast++;
        }
        if (max == 0) {
            return -1;
        }
        return nums.length - max;
    }

    private int getSum(int[] nums, int slow, int fast) {
        int sum = 0;
        for (int i = slow; i <= fast; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        将X减到0的最小操作数 test = new 将X减到0的最小操作数();
        int[] arr = {8828, 9581, 49, 9818, 9974, 9869, 9991, 10000, 10000, 10000, 9999, 9993, 9904, 8819, 1231, 6309};
        System.out.println(test.minOperations(arr, 134365));
    }
}
