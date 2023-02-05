package 滑动窗口与双指针;

public class 最长连续递增序列 {
    public int findLengthOfLCIS(int[] nums) {
        // 数据准备
        int fast  = 0;
        int slow = 0;
        int max = 0;
        // 滑动窗口
        while (fast<=nums.length-1){
            if (fast==slow){
                fast++;
            }else if (fast+1<=nums.length &&nums[fast-1]<nums[fast]){
                fast++;
            }else {
                slow=fast;
            }
            max = Math.max(fast-slow,max);
        }
        return max;
    }

    public static void main(String[] args) {
        最长连续递增序列 test = new 最长连续递增序列();
        int[] arr = {1,3,5,4,7};
        System.out.println(test.findLengthOfLCIS(arr));
        int[] arr2 = {2,2,2,2,2};
        System.out.println(test.findLengthOfLCIS(arr2));
        int[] arr3 = {1,3,5,7};
        System.out.println(test.findLengthOfLCIS(arr3));


    }
}
