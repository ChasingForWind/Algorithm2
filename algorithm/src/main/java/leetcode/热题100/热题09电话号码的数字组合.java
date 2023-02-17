package leetcode.热题100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 热题09电话号码的数字组合 {

    ArrayList<String> res = new ArrayList<>();

    Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.equals("")) {
            return res;
        }
        help(digits, 0, "");
        return res;

    }

    public void help(String digits, Integer index, String s) {
        if (index == digits.length()) {
            res.add(s);
            return;
        }
        char c = digits.charAt(index);
        String numberStr = phoneMap.get(c);
        for (int i = 0; i < numberStr.length(); i++) {
            help(digits, index+1, s + numberStr.charAt(i));
        }
    }
}
