package swordoffer;

/**
 * @Classname 数组中的逆序对
 * @Description TODO
 * @Date 2022/7/8 08:22
 * @Created by liuchang
 */
public class 数组中的逆序对 {
    int res;
    public int reversePairs(int[] nums) {
        mySort(nums,0,nums.length-1);
        return res;
    }

    private void mySort(int[] nums, int left, int right) {
        if (left>=right){
            return;
        }
        int mid = left+(right-left)/2;
        mySort(nums,left,mid);
        mySort(nums,mid+1,right);

        merge(nums,left,mid,right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        //起始点
        int index1 = mid;
        int index2 = right;
        // 辅助数组
        int[] temp = new int[right-left+1];
        int j = temp.length-1;
        //开始归并
        while (index1>=0&&index2>mid){
            if (nums[index1]>nums[index2]){
                temp[j] = nums[index1];
                j--;
                index1--;
            }else {
                temp[j] = nums[index2];
                j--;
                index2--;
                res += index2 - mid + 1;
            }
        }
        while (index1>=0){
            temp[j] = nums[index1];
            j--;
            index1--;
        }
        while (index2>mid){
            temp[j] = nums[index2];
            j--;
            index2--;
        }

        // 复制数据
        int k = 0;
        for (int i = left; i <=right ; i++) {
            nums[i] = temp[k];
            k++;
        }
    }


}
