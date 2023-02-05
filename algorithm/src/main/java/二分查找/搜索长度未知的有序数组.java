package 二分查找;

public class 搜索长度未知的有序数组 {
    public int search(ArrayReader reader, int target) {
        // step1 先确定大致范围
        if (reader.get(0)==target){
            return 0;
        }
        int k = 1;
        while (reader.get(k)<target){
            k*=2;
        }
        // step2 再二分求解
        int l = 0;
        int r = k;
        while (l<=r){
            int mid = l + (r-l)/2;
            if (reader.get(mid)==target){
                return mid;
            }else if (reader.get(mid)>target){
                r = mid-1;
            }else {
                l = mid+1;
            }
        }
        return -1;
    }
}
