package 滑动窗口与双指针;

public class 移除元素 {
    public int removeElement(int[] nums, int val) {
        // 辅助数据结构
        int fast = 0;
        int slow = 0;
        // 开始遍历
        while (fast<=nums.length-1){
            if (nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
                fast++;
                continue;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        移除元素 test = new 移除元素();
        int[] arr = {0,1,2,2,3,0,4,2};

        System.out.println(test.removeElement(arr, 2));
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+" ");
        }
    }
}
