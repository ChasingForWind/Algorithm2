package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Classname Leetcode338
 * @Description 比特位计算
 * @Date 2021/6/21 10:17 下午
 * @Created by liuchang
 */
public class Leetcode338 {
    public int[] countBits(int n) {
//        int[] arr = null;
//        //代码鲁棒性
//        if (n<0) return arr;
//        //构造数组
//        ArrayList<Integer> tempArr = new ArrayList<>();
//        //遍历创造
//        tempArr.add(0);
//        int i = 1;
//        while (i<=n){
//            if (i%2 == 1){
//                tempArr.add(tempArr.get(i-1)+1);
//            }else{
//                tempArr.add(tempArr.get(i/2));
//            }
//            i++;
//        }
//        //返回数组
//        return tempArr.stream().mapToInt(Integer::valueOf).toArray();
        int[] arr = new int[n + 1];
        if (n < 0) return arr;
        arr[0] = 0;

        int i = 1;
        while (i <= n) {
            if (i%2 ==0){
                arr[i] = arr[i/2];
            }else {
                arr[i] = arr[i-1]+1;
            }
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Leetcode338 test = new Leetcode338();
        int[] res = test.countBits(5);
        Arrays.stream(res).forEach(System.out::println);
    }
}
