package swordoffer;

import java.util.Stack;

/**
 * @Classname 翻转单词顺序
 * @Description TODO
 * @Date 2022/6/5 17:57
 * @Created by liuchang
 */
public class 翻转单词顺序 {
    public String reverseWords(String s) {
        if (s.length()==0||s==null){
            return "";
        }

        //step1 去掉前后空格
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while (left<ch.length-1&&ch[left]==' '){
            left++;
        }
        while (right>0 && ch[right]==' '){
            right--;
        }

        //step2 栈
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = left; i <=right ; i++) {

            if (ch[i]!=' '){
                sb.append(ch[i]);
            }

            if (ch[i]==' '&&sb.length()>0){
                stack.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        stack.add(sb.toString());

        //重新拼接
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            String pop = stack.pop();
            res.append(pop).append(' ');
        }
        res.deleteCharAt(res.length()-1);

        return res.toString();
    }

    public static void main(String[] args) {
        翻转单词顺序 test = new 翻转单词顺序();
        String s = "the sky";
        System.out.println(test.reverseWords(s));
    }
}
