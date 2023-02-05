package 排序;

/**
 * @Classname 归并排序
 * @Description TODO
 * @Date 2022/6/14 07:56
 * @Created by liuchang
 */
public class 归并排序 {
    public int[] sortArray(int[] nums) {
        if (nums.length<2){
            return nums;
        }
        int[] help = new int[nums.length];

        sortHelp(nums,help,0,nums.length-1);

        return nums;
    }

    public void sortHelp(int[] nums,int[] help ,int left ,int right){
        if (left>=right){
            return;
        }
        int mid = left + (right-left)/2;
        sortHelp(nums,help,left,mid);
        sortHelp(nums,help,mid+1,right);
        merge(nums,help,left,mid,right);
    }

    private void merge(int[] nums, int[] help, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int i = left;
        while (l<=mid&&r<=right){
            if (nums[l]<nums[r]){
                help[i] = nums[l];
                i++;
                l++;
            }else {
                help[i] = nums[r];
                i++;
                r++;
            }
        }
        while (l<=mid){
            help[i] = nums[l];
            i++;
            l++;
        }
        while (r<=right){
            help[i] = nums[r];
            i++;
            r++;
        }

        for (int j = left; j <=right ; j++) {
            nums[j] = help[j];
        }
    }

    public static void main(String[] args) {
        归并排序 test = new 归并排序();
        int[] arr = {3,4,1,2,5};
        test.sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
