package 滑动窗口与双指针;

public class 数组中第K大的元素 {
    public int findKthLargest(int[] nums, int k) {
        // 鲁棒性
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // 辅助函数
        int index = help(nums, 0, nums.length - 1, nums.length-k);

        // 返回
        return nums[index];
    }

    public int help(int[] nums, int left, int right, int k) {
        if (left == right) {
            return left;
        }
        int res = patrition(nums, left, right, k);
        if (res > k) {
            return help(nums, left, res - 1, k);
        } else if (res < k) {
            return help(nums, res + 1, right, k);
        } else {
            return res;
        }
    }

    private int patrition(int[] nums, int left, int right, int k) {
        if (left == right) {
            return left;
        }
        // 辅助数据
        int goal = nums[right];
        int less = left - 1;
        int index = left;
        // 开始遍历
        while (index <= right - 1) {
            if (nums[index] <= goal) {
                less++;
                swap(nums, less, index);
                index++;
            } else {
                index++;
            }
        }
        swap(nums, less + 1, right);
        // 返回结果
        return less + 1;
    }


    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        数组中第K大的元素 test = new 数组中第K大的元素();
        int[] arr = {3, 2, 1, 5, 6, 4};
        System.out.println(test.findKthLargest(arr, 2));
    }
}
