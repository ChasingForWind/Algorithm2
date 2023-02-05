package 堆;

import java.util.PriorityQueue;

public class 最后一块石头的重量 {
    public int lastStoneWeight(int[] stones) {
        // 创建堆
        PriorityQueue<Integer> priority = new PriorityQueue<Integer>((a, b) -> b - a);
        // 把所有石头放到堆中去
        for (int stone : stones){
            priority.add(stone);
        }
        // 循环拿出两块石头操作后放入堆中
        while (priority.size()>1){
            Integer stone1 = priority.poll();
            Integer stone2 = priority.poll();
            priority.add(Math.abs(stone1-stone2));
        }
        // 返回结果
        return priority.peek();
    }

    public static void main(String[] args) {
        最后一块石头的重量 test = new 最后一块石头的重量();
        int[] arr = {2,7,4,1,8,1};
        System.out.println(test.lastStoneWeight(arr));
    }
}


