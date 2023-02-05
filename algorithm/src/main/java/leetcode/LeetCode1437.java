package leetcode;

/**
 * @Classname LeetCode1437
 * @Description 是否所有1都相隔k个元素
 * @Date 2021/6/22 9:48 下午
 * @Created by liuchang
 */
public class LeetCode1437 {
    public boolean kLengthApart(int[] nums, int k) {
//        //代码鲁棒性
//        if (nums == null || k < 0) return false;
//        //指针 第一次出现1的地方
//        int index1 = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) {
//                index1 = i;
//                break;
//            }
//        }
//        int temp = Integer.MAX_VALUE;
//        if (index1 + 1 <= nums.length - 1) {
//            for (int i = index1 + 1; i < nums.length; i++) {
//                if (nums[i] == 1) {
//                    temp = i - index1 - 1;
//                    index1 = i;
//                    if (index1 + 1 > nums.length - 1) {
//                        break;
//                    }
//                }
//            }
//        }
//        //比较
//        //System.out.println(temp);
//        //System.out.println(index1);
//        return temp >= k;
        int n = nums.length;
        int pre = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i]==1) {
                if (pre != -1 && i - pre - 1 > k) {
                    return false;
                }
                pre=i;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LeetCode1437 test = new LeetCode1437();
        int[] arr = {0,1,0,1};
        System.out.println(test.kLengthApart(arr, 1));
    }
}
