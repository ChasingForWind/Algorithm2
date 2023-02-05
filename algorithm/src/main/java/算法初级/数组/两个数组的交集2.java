package 算法初级.数组;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Classname 两个数组的交集2
 * @Description TODO
 * @Date 2022/7/19 08:03
 * @Created by liuchang
 */
public class 两个数组的交集2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int key : nums1) {
            map1.put(key,map1.getOrDefault(key,0)+1);
        }


        for (int key : nums2) {
            map2.put(key,map2.getOrDefault(key,0)+1);
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                int num = Math.min(map2.get(entry.getKey()), entry.getValue());
                for (int i = 0; i < num; i++) {
                    arr.add(entry.getKey());
                }
            }
        }

        int[] res = new int[arr.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
}
