package 二分查找;

public class 分割数组最大值 {
    public int splitArray(int[] nums, int m) {
        int max = 0;
        int sum = 0;

        for (int num:nums){
            max = Math.max(max,num);
            sum += num;
        }
        int left = max;
        int right = sum;
        while (left<right){
            int mid = left + (right-left)/2;
            int split = splitHelper(mid,nums);
            if (split>m){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }

    private int splitHelper(int mid, int[] nums) {
        int split = 1;
        int count = 0;
        for (int num:nums) {
            if (num + count>mid){
                split++;
                count = 0;
            }
            count +=num;
        }
        return split;
    }

    public static void main(String[] args) {
        分割数组最大值 test = new 分割数组最大值();
        int[] arr = {7,2,5,10,8};
        System.out.println(test.splitArray(arr, 2));
    }
}
