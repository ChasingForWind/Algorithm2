package leetcode.热题100;

import java.util.HashMap;
import java.util.Stack;

public class 热题11有效括号 {
    public boolean isValid(String s) {
        // 字典
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        // 辅助数据结构
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();

        // 开始循环
        for (char c : ch) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                else if (c != map.get(stack.peek())) return false;
                else stack.pop();
            }
        }

        // 验证
        return stack.isEmpty();
    }
}
