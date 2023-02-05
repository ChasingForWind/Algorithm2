package 算法初级.字符串;

import java.util.HashMap;

public class 同构字符串 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            if (!map.containsKey(ch1[i])){
                if (map.containsValue(ch2[i])){
                    return false;
                }
                map.put(ch1[i],ch2[i]);
            }else {
                if (!map.get(ch1[i]).equals(ch2[i])){
                    return false;
                }
            }
        }
        return true;
    }

    //s = "egg", t = "add"
    //s = "foo", t = "bar"
    //s = "paper", t = "title"
    //s = "badc", t = "baba"
    public static void main(String[] args) {
        同构字符串 test = new 同构字符串();
//        System.out.println(test.isIsomorphic("egg", "add"));
//        System.out.println(test.isIsomorphic("foo", "bar"));
//        System.out.println(test.isIsomorphic("paper", "title"));
        System.out.println(test.isIsomorphic("badc", "baba"));
    }
}
