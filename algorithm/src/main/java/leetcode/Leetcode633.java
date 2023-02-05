package leetcode;

/**
 * @Classname Leetcode633
 * @Description 633
 * @Date 2021/4/8 10:32 下午
 * @Created by liuchang
 */
public class Leetcode633 {

    public static void main(String[] args) {
        judgeSquareSum(5);
    }

    public static boolean judgeSquareSum(int c) {
        //定义两个指针和中间变量
        int left = 1;
        int right = (int) Math.sqrt(c);
        int temp;
        //while循环
        while (left<right){
            temp = left*left + right*right;
            //大于则右边指针移动
            if (temp>c){
                right--;
            }else if(temp<c){   //小于则左边指针移动
                left++;
            }else {     //等于返回调出循环
                return true;
            }
        }

        //返回
        return false;
    }
}
