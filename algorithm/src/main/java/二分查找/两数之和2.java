package 二分查找;

public class 两数之和2 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int index = -1;
        while (i<numbers.length){
            int pair = target - numbers[i];
            index = find(pair, numbers, i + 1, numbers.length - 1);
            if (index!=-1){
                break;
            }
            i++;
        }
        if (index == -1){
            return null;
        }
        int[] res = new int[2];
        res[0] = i+1;
        res[1] = index+1;
        return res;
    }

    public int find(int target ,int[] num,int left ,int right){
        if (left>right){
            return -1;
        }
        int l = left;
        int r = right;
        while (l<=r){
            int mid = l + (r-l)/2;
            if (num[mid]==target){
                return mid;
            }else if (num[mid]>target){
                r = mid-1;
            }else {
                l = mid+1;
            }
        }
        return -1;
    }
}
