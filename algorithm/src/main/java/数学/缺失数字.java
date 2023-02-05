package 数学;

public class 缺失数字 {
    public int missingNumber(int[] nums) {
        // 求和
        int n = nums.length;
        int sum = n*(n+1)/2;
        // 遍历相减
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }
}
