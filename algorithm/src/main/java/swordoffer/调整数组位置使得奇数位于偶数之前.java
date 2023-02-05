package swordoffer;

/**
 * @Classname 调整数组位置使得奇数位于偶数之前
 * @Description TODO
 * @Date 2022/6/5 17:13
 * @Created by liuchang
 */
public class 调整数组位置使得奇数位于偶数之前 {
    public int[] exchange(int[] nums) {
        int index2 = nums.length-1;
        int index1 = 0;
        while (index1<index2){
            while (index1<nums.length-1&&nums[index1]%2!=0){
                index1++;
            }
            while (index2>0&&nums[index2]%2!=1){
                index2--;
            }
            if (index1<index2){
                int temp = nums[index1];
                nums[index1] = nums[index2];
                nums[index2] = temp;
                index1++;
                index2--;
            }else {
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        调整数组位置使得奇数位于偶数之前 test = new 调整数组位置使得奇数位于偶数之前();
        int[] arr = {1,3,5};
        int[] exchange = test.exchange(arr);
        for (int i = 0; i < exchange.length; i++) {
            System.out.println(exchange[i]);
        }

    }
}
