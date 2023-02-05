package swordoffer;

/**
 * @Classname Offer005
 * @Description TODO
 * @Date 2022/4/28 08:11
 * @Created by liuchang
 */
public class 替换字符串 {
    public String replaceSpace(String s) {
        // 由于每个字符替换后乘以3，所以准备一个3倍长的字符数组
        int size = s.length()*3;
        char[] ch = new char[size];
        int k =0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                ch[k] = '%';
                ch[++k] = '2';
                ch[++k] = '0';
                k++;
            }else {
                ch[k++] = s.charAt(i);
            }
        }
        return new String(ch,0,k);
    }

    public static void main(String[] args) {
        替换字符串 offer005 = new 替换字符串();
        offer005.replaceSpace("We are happy.");
    }
}
