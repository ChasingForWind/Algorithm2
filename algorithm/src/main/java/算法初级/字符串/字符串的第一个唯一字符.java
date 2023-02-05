package 算法初级.字符串;

import java.util.HashMap;

public class 字符串的第一个唯一字符 {
    public int firstUniqChar(String s) {
        // 第一次遍历存储次数
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])){
                map.put(ch[i],-1);
            }else {
                map.put(ch[i],i);
            }
        }
        // 第二次遍历返回索引
        for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i])!=-1){
                return i;
            }
        }

        return -1;
    }
}
