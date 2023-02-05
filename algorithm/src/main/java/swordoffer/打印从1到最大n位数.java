package swordoffer;

/**
 * @Classname 打印从1到最大n位数
 * @Description TODO
 * @Date 2022/7/7 08:27
 * @Created by liuchang
 */
public class 打印从1到最大n位数 {
    public int[] printNumbers(int n) {
        int[] arr = new int[(int) Math.pow(10,n)-1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        return arr;
    }
}
