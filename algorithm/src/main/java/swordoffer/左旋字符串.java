package swordoffer;

/**
 * @Classname 左旋字符串
 * @Description TODO
 * @Date 2022/5/19 07:38
 * @Created by liuchang
 */
public class 左旋字符串 {
    public String reverseLeftWords(String s, int n) {
        String s1 = s.substring(n, s.length());
        String s2 = s.substring(0, n);
        return s1 + s2;
    }

    public static void main(String[] args) {
        String abcdefg = new 左旋字符串().reverseLeftWords("abcdefg", 2);
        System.out.println(abcdefg);
    }
}
