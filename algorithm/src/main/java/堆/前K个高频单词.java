package 堆;

import java.util.*;

public class 前K个高频单词 {
    public List<String> topKFrequent(String[] words, int k) {
        // hash表统计个数
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }
        // 最小堆辅助排序
        PriorityQueue<String> priorityQueue = new PriorityQueue<>((a, b) -> {
            if (countMap.get(a).equals(countMap.get(b))) {
                return b.compareTo(a);
            } else {
                return countMap.get(a) - countMap.get(b);
            }
        });
        for (String key:countMap.keySet()){
            priorityQueue.offer(key);
            if (priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        // 按要求吐出前K个元素
        List<String> resList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            resList.add(priorityQueue.poll());
        }
        Collections.reverse(resList);
        return resList;
    }

    public static void main(String[] args) {
        前K个高频单词 test = new 前K个高频单词();
        String[] arr = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> res = test.topKFrequent(arr, k);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

    }
}

//    public List<String> topKFrequent(String[] words, int k) {
//        // 1.先用哈希表统计单词出现的频率
//        Map<String, Integer> count = new HashMap();
//        for (String word : words) {
//            count.put(word, count.getOrDefault(word, 0) + 1);
//        }
//        // 2.构建小根堆 这里需要自己构建比较规则 此处为 lambda 写法 Java 的优先队列默认实现就是小根堆
//        PriorityQueue<String> minHeap = new PriorityQueue<>((s1, s2) -> {
//            if (count.get(s1).equals(count.get(s2))) {
//                return s2.compareTo(s1);
//            } else {
//                return count.get(s1) - count.get(s2);
//            }
//        });
//        // 3.依次向堆加入元素。
//        for (String s : count.keySet()) {
//            minHeap.offer(s);
//            // 当堆中元素个数大于 k 个的时候，需要弹出堆顶最小的元素。
//            if (minHeap.size() > k) {
//                minHeap.poll();
//            }
//        }
//        // 4.依次弹出堆中的 K 个元素，放入结果集合中。
//        List<String> res = new ArrayList<String>(k);
//        while (minHeap.size() > 0) {
//            res.add(minHeap.poll());
//        }
//        // 5.注意最后需要反转元素的顺序。
//        Collections.reverse(res);
//        return res;
//    }

