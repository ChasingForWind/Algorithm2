package 栈;

import java.util.Stack;

public class 字符串解码 {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        Stack<Integer> numStcak = new Stack<>();
        Stack<String> strStack = new Stack<>();
        char[] ch = s.toCharArray();
        for (Character c : ch){
            if (c=='['){
                strStack.add(sb.toString());
                numStcak.add(num);
                num = 0;
                sb = new StringBuilder();
            }
            else if (c==']'){
                Integer popNum = numStcak.pop();
                StringBuilder tmp = new StringBuilder();
                for (int i = 0; i < popNum; i++) {
                    tmp.append(sb);
                }
                sb = new StringBuilder(strStack.pop()+tmp);
            }
            else if (c>='0'&&c<='9'){
                num = num*10 + Integer.parseInt(c+"");
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        字符串解码 test = new 字符串解码();
        String s = test.decodeString("3[a]2[bc]");
        System.out.println(s);
    }
}




