package 栈;

import java.util.Stack;

public class 比较含退格的字符串 {
    public boolean backspaceCompare(String s, String t) {
        String s1 = strHandler(s);
        String s2 = strHandler(t);
        return s1.equals(s2);
    }

    public static String strHandler(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        // step1 初始化，处理
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        // step2 遍历
        for (char c : ch) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            }
            stack.push(c);
        }
        // step3 返回
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        比较含退格的字符串 test = new 比较含退格的字符串();
        boolean b = test.backspaceCompare("ab#c", "ad#c");
        System.out.println(b);
        boolean b1 = test.backspaceCompare("ab##", "c#d#");
        System.out.println(b1);
        boolean b2 = test.backspaceCompare("a#c", "b");
        System.out.println(b2);
    }
}
