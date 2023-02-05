package leetcode;

/**
 * @Classname Leetcode680
 * @Description 算法
 * @Date 2021/4/9 10:25 下午
 * @Created by liuchang
 */
public class Leetcode680 {
    public boolean validPalindrome(String s) {
        //定义指针
        int left = 0;
        int right = s.length()-1;
        //while循环
        while (left<right){
            if (s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else {
                return validWithIndex(s,left+1,right)||validWithIndex(s,left,right-1);
            }
        }
        //返回
        return true;
    }

    //写一个方法如指针和字符串进行判断
    public boolean validWithIndex(String s,int left, int right){
        while (left<right){
            if (s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
}
