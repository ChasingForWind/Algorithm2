package 算法初级.数组;

import java.util.HashMap;

/**
 * @Classname 存在重复元素
 * @Description TODO
 * @Date 2022/7/19 07:51
 * @Created by liuchang
 */
public class 存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : nums) {
            if (map.containsKey(key)) {
                return true;
            } else {
                map.put(key, 1);
            }
        }
        return false;
    }

}
