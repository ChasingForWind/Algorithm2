package 二分查找;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class 两个数组的交集2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        // step1 排序
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        // step2 遍历nums1
        ArrayList<Integer> res = new ArrayList<>();
        for (int j = 0; j < nums1.length; j++) {
            int count1 = 1;
            while (j+1<= nums1.length-1&&nums1[j+1]==nums1[j]){
                count1++;
                j++;
            }
            int count2 = find(nums1[j], nums2);
            if (count1>count2){
                while (count2>0){
                    res.add(nums1[j]);
                    count2--;
                }
            }else {
                while (count1>0){
                    res.add(nums1[j]);
                    count1--;
                }
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

    public int find(int target ,int[] num){
        int l = 0;
        int r = num.length-1;
        int count = 0;
        while (l<=r){
            int mid = l + (r-l)/2;
            if (num[mid]==target){
                // 说明至少找到一个
                count++;
                //左右两边分开找
                int temp = mid;
                while (temp+1<=num.length-1&&num[temp+1]==target){
                    count++;
                    temp++;
                }
                temp = mid;
                while (temp-1>=0&&num[temp-1]==target){
                    count++;
                    temp--;
                }
                return count;
            }else if (num[mid]>target){
                r = mid-1;
            }else {
                l = mid+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        两个数组的交集2 test = new 两个数组的交集2();
        int[] a1 = {43,85,49,2,83,2,39,99,15,70,39,27,71,3,88,5,19,5,68,34,7,41,84,2,13,85,12,54,7,9,13,19,92};
        int[] a2 = {10,8,53,63,58,83,26,10,58,3,61,56,55,38,81,29,69,55,86,23,91,44,9,98,41,48,41,16,42,72,6,4,2,81,42,84,4,13};
        int[] intersection = test.intersect(a1, a2);
        for (int i = 0; i < intersection.length; i++) {
            System.out.print(intersection[i]+" ");
        }
    }
}
