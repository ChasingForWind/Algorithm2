package swordoffer;

/**
 * @Classname 构建数组乘积
 * @Description TODO
 * @Date 2022/6/29 08:28
 * @Created by liuchang
 */
public class 构建数组乘积 {
    public int[] constructArr(int[] a) {
        int[] left = new int[a.length];
        int[] right = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (i==0){
                left[i] = 1;
            }else {
                left[i] = left[i-1]*a[i-1];
            }
        }

        for (int j = a.length-1; j >=0 ; j--) {
            if (j==a.length-1){
                right[j] = 1;
            }else {
                right[j] = right[j+1]*a[j+1];
            }
        }

        int[] res = new int[a.length];

        for (int k = 0; k < res.length; k++) {
            res[k] = left[k]*right[k];
        }
        return res;
    }
}
