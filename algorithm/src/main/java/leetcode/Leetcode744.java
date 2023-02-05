package leetcode;

/**
 * @Classname Leetcode744
 * @Description TODO
 * @Date 2022/5/25 08:01
 * @Created by liuchang
 */
public class Leetcode744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length-1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if (letters[mid]==target){
                //往后找到第一个比它大的字母
                int temp = mid;
                while (temp<=letters.length-1){
                    if (letters[temp]>target){
                        return letters[temp];
                    }
                    temp++;
                }
                return letters[0];
            }else if (letters[mid]<target){
                l = l+1;
            }else {
                r = r-1;
            }
        }
        if (l>letters.length-1){
            return letters[0];
        }else {
            return letters[l];
        }
    }
}
