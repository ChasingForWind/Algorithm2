package swordoffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname 队列的最大值
 * @Description TODO
 * @Date 2022/7/3 18:10
 * @Created by liuchang
 */
public class 队列的最大值 {

}

class MaxQueue {
    LinkedList<Integer> maxQueue;
    LinkedList<Integer> normalQueue;

    public MaxQueue() {
        maxQueue = new LinkedList<>();
        normalQueue = new LinkedList<>();
    }

    public int max_value() {
        if (!maxQueue.isEmpty()){
            return maxQueue.peek();
        }else {
            return -1;
        }
    }

    public void push_back(int value) {
        normalQueue.add(value);
        if (maxQueue.isEmpty()){
            maxQueue.add(value);
        }else {
            while (!maxQueue.isEmpty()&&maxQueue.peekLast()<value){
                maxQueue.pollLast();
            }
            maxQueue.add(value);
        }
    }

    public int pop_front() {
        if (normalQueue.isEmpty()){
            return -1;
        }else {
            if ( normalQueue.peekFirst()<maxQueue.peekFirst()){
                return normalQueue.pollFirst();
            }else {
                maxQueue.pollFirst();
                return normalQueue.pollFirst();
            }
        }
    }
}
