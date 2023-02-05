package 滑动窗口与双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 找到字符串中所有的字母异位词 {
    public List<Integer> findAnagrams(String s, String p) {
        // step0 判断相等的辅助工具
        int[] help = new int[26];
        char[] pchar = p.toCharArray();
        for (int i = 0; i < pchar.length; i++) {
            help[pchar[i]-'a']++;
        }
        // step1 开始双指针滑行
        char[] schar = s.toCharArray();
        int start = 0;
        int end = 0;
        int[] window = new int[26];
        List<Integer> res = new ArrayList<>();
        while (end<schar.length){
            window[schar[end]-'a']++;
            if (end-start+1==pchar.length){
                if (Arrays.equals(help,window)){
                    res.add(start);
                }
                window[schar[start]-'a']--;
                start++;
            }
            end++;
        }
        return res;
    }

    public static void main(String[] args) {
        找到字符串中所有的字母异位词 test = new 找到字符串中所有的字母异位词();
        List<Integer> res = test.findAnagrams("cbaebabacd", "abc");
        for (int i = 0; i < res.size(); i++) {
            System.out.printf(res.get(i)+" ");
        }
    }
}
