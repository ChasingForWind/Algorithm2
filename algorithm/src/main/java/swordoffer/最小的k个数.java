package swordoffer;

/**
 * @Classname 最小的k个数
 * @Description TODO
 * @Date 2022/6/21 08:08
 * @Created by liuchang
 */
public class 最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length==0||k==0) {
            return new int[0];
        }
        // 快排变形迭代
        partitionArray(arr,0,arr.length-1,k);
        // 获取前k个数返回
        int[] res = new int[k];
        if (k >= 0) {
            System.arraycopy(arr, 0, res, 0, k);
        }
        return res;
    }

    public void partitionArray(int[] arr,int left, int right, int k){
        int index = partition(arr, left, right);
        if (index==k){
            return;
        }
        else if (index<k){
            partitionArray(arr,index+1,right,k);
        }else {
            partitionArray(arr,left,index-1,k);
        }
    }

    public int partition(int[] arr,int left, int right){
        if (left>=right) {
            return left;
        }
        int l = left;
        int r = right;
        int pivot = arr[left];
        while (true){
            while ( l<r &&arr[l]<=pivot){
                l++;
            }
            while (l<r &&arr[r]>pivot){
                r--;
            }

            if (l>=r){
                break;
            }
            swap(arr,l,r);
        }

        swap(arr,left,r);

        return r;
    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        最小的k个数 test = new 最小的k个数();
        int[] arr = {
                0,1,0,2,1,4,5,4,3,4,1,1,6,3,14,13,8,2,2,13,0,
                6,18,3,1,8,8,5,9,5,28,21,8,17,5,16,9,37,37,30,
                33,14,22,37,7,27,29,22,38,41,36,43,29,45,49,8,
                9,20,42,19,60,56,19,32,44,16,28,8,59,55,68,52,
                31,49,28,52,33,8,33,38,69,47,59,61,6,64,79,59,
                78,28,27,39,43,14,40,57,96,81,38,94};
        test.getLeastNumbers(arr,78);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
