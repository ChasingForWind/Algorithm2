package 二分查找;

import java.util.ArrayList;
import java.util.List;

public class 找到k个最接近的元素 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int r = arr.length-k;
        while (l<r){
            int mid = l + (r-l)/2;
            if (x-arr[mid]>arr[mid+k]-x){
                l = mid+1;
            }else {
                r = mid;
            }
        }

        List<Integer> res = new ArrayList<>();
        int n = 0;
        while (n<k){
            res.add(arr[l+n]);
            n++;
        }
        return res;
    }
}
