package swordoffer;

import java.math.BigDecimal;

/**
 * @Classname 把字符串转换成整数
 * @Description TODO
 * @Date 2022/7/1 08:01
 * @Created by liuchang
 */
public class 把字符串转换成整数 {
    public int strToInt(String str) {
        if (str==null || str.length() == 0){
            return 0;
        }

        str = str.trim();
        char[] ch = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (i==0){
                if (ch[i]=='+'||ch[i]=='-'){
                    sb.append(ch[i]);
                    continue;
                }else if (ch[i]>='0'&&ch[i]<='9'){
                    sb.append(ch[i]);
                    continue;
                }else {
                    return 0;
                }
            }
            if (ch[i]>='0'&&ch[i]<='9'){
                sb.append(ch[i]);
            }else {
                break;
            }
        }

        String s = sb.toString();
        if (s.length()==0){
            return 0;
        }


        if ((s.charAt(0)=='+'||s.charAt(0)=='-')){
            if (s.length()==1){
                return 0;
            }else {
                s = s.substring(1, s.length());
            }
        }


        long value = 0;
        try {
            value = Long.parseLong(s);
        }catch (Exception e){
            if (str.charAt(0)=='-'){
                return Integer.MIN_VALUE;
            }else {
                return Integer.MAX_VALUE;
            }
        }


        if (str.charAt(0)=='-'){
            value = -value;
            if (value<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }else {
                return (int) value;
            }
        }else {
            if (value>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else {
                return (int) value;
            }
        }
    }

    public static void main(String[] args) {
        把字符串转换成整数 test = new 把字符串转换成整数();
        System.out.println(test.strToInt("20000000000000000000"));
    }
}
