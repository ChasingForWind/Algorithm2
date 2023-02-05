package 滑动窗口与双指针;

public class 子数组最大平均数1 {
    public double findMaxAverage(int[] nums, int k) {
        // 鲁棒性
        if (nums.length<=k){
            double res = 0;
            for (int num : nums) {
                res += num;
            }
            return res/nums.length;
        }
        // 第一个窗口
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        // 滑动窗口
        double res = windowSum;
        for (int i = k; i < nums.length ; i++) {
            windowSum = windowSum + nums[i] - nums[i-k];
            res = Math.max(windowSum,res);
        }
        // 返回数值
        return res/k;
    }

    public static void main(String[] args) {
        子数组最大平均数1 test = new 子数组最大平均数1();
        int[] arr = {9,7,3,5,6,2,0,8,1,9};
        System.out.println(test.findMaxAverage(arr, 6));
    }
}
