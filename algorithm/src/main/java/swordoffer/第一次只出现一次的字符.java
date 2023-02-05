package swordoffer;

import java.util.HashMap;

/**
 * @Classname 第一次只出现一次的字符
 * @Description TODO
 * @Date 2022/5/27 07:33
 * @Created by liuchang
 */
public class 第一次只出现一次的字符 {
    public char firstUniqChar(String s) {
        if(s==null||s.length()==0){
            return ' ';
        }
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : arr) {
            if (map.get(c)==1){
                return c;
            }
        }
        return ' ';
    }
}
