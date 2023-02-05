package 滑动窗口与双指针;

public class 长度最小的子数组 {
    public int minSubArrayLen(int target, int[] nums) {
        // 数据准备
        int slow = 0;
        int fast = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        // 开始滑动
        while (fast<=nums.length-1){
            sum += nums[fast];
            while (sum>=target){
                len = Math.min(len,fast-slow+1);
                sum -= nums[slow];
                slow++;
            }
            fast++;
        }
        return len==Integer.MAX_VALUE?0:len;
    }


    public static void main(String[] args) {
        长度最小的子数组 test = new 长度最小的子数组();
        int[] arr = {2,3,1,2,4,3};
        System.out.println(test.minSubArrayLen(7, arr));

        int[] arr2 = {1,4,4};
        System.out.println(test.minSubArrayLen(4, arr2));

        int[] arr3 = {1,1,1,1,1,1,1,1};
        System.out.println(test.minSubArrayLen(11, arr3));

        int[] arr4 = {1,2,3,4,5};
        System.out.println(test.minSubArrayLen(11, arr4));

    }
}
