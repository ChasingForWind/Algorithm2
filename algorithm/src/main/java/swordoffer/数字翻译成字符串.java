package swordoffer;

import java.util.Stack;

/**
 * @Classname 数字翻译成字符串
 * @Description TODO
 * @Date 2022/6/5 11:39
 * @Created by liuchang
 */
public class 数字翻译成字符串 {
    public int translateNum(int num) {
        //全部变成数组
        Stack<Integer> stack = new Stack<>();
        while (num!=0){
            int temp = num%10;
            stack.push(temp);
            num = num/10;
        }
        int[] arr = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()){
            arr[i] = stack.pop();
            i++;
        }

        //动态规划
        if (arr.length==0){
            return 1;
        }
        if (arr.length==1){
            return 1;
        }

        int[] dp = new int[arr.length];
        dp[0] = 1;
        if (arr[1]+arr[0]*10>25||arr[0]==0){
            dp[1] = 1;
        }else {
            dp[1] = 2;
        }
        for (int j = 2; j <=arr.length-1 ; j++) {
            if (arr[j]+arr[j-1]*10>25||arr[j-1]==0){
                dp[j] = dp[j-1];
            }else {
                dp[j] = dp[j-1]+dp[j-2];
            }
        }
        return dp[arr.length-1];
    }
}
