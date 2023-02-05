package 算法初级.数组;

import java.util.Arrays;

public class 判断句子是否为全字母句 {
    public boolean checkIfPangram(String sentence) {
        int[] dict = new int[26];
        Arrays.fill(dict, 1);
        char[] ch = sentence.toCharArray();
        for (char c : ch) {
            if (dict[c - 'a'] == 1) {
                dict[c - 'a'] = 0;
            }
        }
        for (int j : dict) {
            if (j == 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        判断句子是否为全字母句 test = new 判断句子是否为全字母句();
        System.out.println(test.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(test.checkIfPangram("leetcode"));
    }
}
