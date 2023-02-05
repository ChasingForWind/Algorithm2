package swordoffer;

/**
 * @Classname Offer011
 * @Description TODO
 * @Date 2022/4/30 20:50
 * @Created by liuchang
 */
public class Offer011 {
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        int mid;

        while (left<right){
            mid = (left + right)/2;
            if (numbers[mid]>numbers[right]){
                left = mid + 1;
            }else if (numbers[mid]<numbers[right]){
                right = mid;
            }else {
                right--;
            }
        }
        return numbers[right];
    }
}
