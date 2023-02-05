package swordoffer;

import java.util.PriorityQueue;

/**
 * @Classname 最小的k个数2
 * @Description TODO
 * @Date 2022/6/22 08:32
 * @Created by liuchang
 */
public class 最小的k个数2 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k==0){
            return new int[0];
        }

        //step1 构建堆
        PriorityQueue<Integer> heap = new PriorityQueue<>((i1,i2)->Integer.compare(i2,i1));

        //step2 往堆里塞值
        for (int j : arr) {
            if (heap.isEmpty() || heap.size() < k || heap.peek() > j) {
                heap.offer(j);
            }

            if (heap.size() > k) {
                heap.poll();
            }
        }

        //step3 往堆外倒值
        int[] res = new int[k];
        int t = 0;
        for (int i:heap){
            res[t++] = i;
        }
        return res;
    }
}
