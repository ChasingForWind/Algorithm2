package swordoffer;

/**
 * @Classname 旋转数组中最小数字
 * @Description TODO
 * @Date 2022/5/26 08:02
 * @Created by liuchang
 */
public class 旋转数组中最小数字 {
    public int minArray(int[] numbers) {
        int l = 0;
        int r = numbers.length - 1;
        while (l<=r){
            int mid = l + (r-l)/2;
            if (numbers[mid]>numbers[r]){
                l = mid + 1;
            }else if (numbers[mid]<numbers[r]){
                r = mid;
            }else {
                r = r -1;
            }
        }
        return numbers[l];
    }

    public static void main(String[] args) {
        旋转数组中最小数字 t = new 旋转数组中最小数字();
        int[] arr = {3,1,3};
        System.out.println(t.minArray(arr));
    }
}
