package 算法初级.字符串;

public class 有效字母异位词 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int[] dict = new int[26];

        // 第一次遍历
        for (int i = 0; i < s.length(); i++) {
            dict[s.charAt(i)-'a']++;
        }
        // 第二次遍历
        for (int i = 0; i < t.length(); i++) {
            dict[t.charAt(i)-'a']--;
            if (dict[t.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }
}
