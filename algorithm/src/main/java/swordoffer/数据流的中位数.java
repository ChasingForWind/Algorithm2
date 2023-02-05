package swordoffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @Classname 数据流的中位数
 * @Description TODO
 * @Date 2022/6/23 07:44
 * @Created by liuchang
 */
public class 数据流的中位数 {
}



class MedianFinder {
    PriorityQueue<Double> minHeap;
    PriorityQueue<Double> maxHeap;

    /** initialize your data structure here. */
    public MedianFinder() {
        minHeap = new PriorityQueue<Double>();
        maxHeap = new PriorityQueue<Double>((i1,i2)-> (int)(i2-i1));
    }

    public void addNum(int num) {
        Double numD = (double)num;
        if (maxHeap.size()==minHeap.size()){
            maxHeap.add(numD);
            minHeap.add(maxHeap.poll());
        }else {
            minHeap.add(numD);
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if (minHeap.size()==0){
            return 0;
        }

        if (maxHeap.size()==minHeap.size()){
            return (maxHeap.peek()+minHeap.peek())/2;
        }else {
            return minHeap.peek();
        }
    }
}



class MedianFinder2 {
    ArrayList<Integer> arr;
    /** initialize your data structure here. */
    public MedianFinder2() {
        arr = new ArrayList<>();
    }

    public void addNum(int num) {
        arr.add(num);
        Collections.sort(arr);
    }

    public double findMedian() {
        int size = arr.size();
        if (size%2==1){
            return arr.get(size/2);
        }else {
            int i1 = arr.get(size/2);
            int i2 = arr.get(size/2-1);
            return (double) (i1+i2)/2;
        }
    }
}
