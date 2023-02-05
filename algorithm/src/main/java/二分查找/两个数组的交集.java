package 二分查找;

import java.util.*;

public class 两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        // step1 排序
        Arrays.sort(nums2);
        // step2 遍历nums1
        TreeSet<Integer> res = new TreeSet<>();
        for (int j : nums1) {
            if (find(j, nums2)) {
                res.add(j);
            }
        }
        // step3 返回结果
        int[] resArray = new int[res.size()];
        int i = 0;
        for (Integer num:res){
            resArray[i] = num;
            i++;
        }
        return resArray;
    }

    public boolean find(int target ,int[] num){
        int l = 0;
        int r = num.length-1;
        while (l<=r){
            int mid = l + (r-l)/2;
            if (num[mid]==target){
                return true;
            }else if (num[mid]>target){
                r = mid-1;
            }else {
                l = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        两个数组的交集 test = new 两个数组的交集();
        int[] a1 = {1,2,2,1};
        int[] a2 = {2,2};
        test.intersection(a1,a2);
    }
}
