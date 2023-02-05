package 滑动窗口与双指针;

public class 替换后的最长重复字符串 {
    public int characterReplacement(String s, int k) {
        if (s==null){
            return 0;
        }
        int left = 0;
        int right = 0;
        int[] map = new int[26];
        int historyMax = 0;
        while (right<s.length()){
            int index = s.charAt(right)-'A';
            map[index]++;
            historyMax = Math.max(historyMax,map[index]);
            if (historyMax+k<right-left+1){
                map[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return right-left;
    }
}

