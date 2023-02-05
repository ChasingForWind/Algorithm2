package leetcode;

import java.util.Arrays;

/**
 * @Classname Leetcode556
 * @Description TODO
 * @Date 2022/7/3 19:35
 * @Created by liuchang
 */
public class Leetcode556 {
    public int nextGreaterElement(int n) {
        char[] ch = String.valueOf(n).toCharArray();
        int i = ch.length-2;
        while (i>=0&&ch[i]>=ch[i+1]){
            i--;
        }

        if (i>=0){
            int j = ch.length - 1;
            while (j>=0&&ch[i]>=ch[j]){
                j--;
            }
            swap(ch,i,j);
        }

        reverse(ch,i);

        String s = new String(ch);

        try {
            int res = Integer.parseInt(s);
            return res<=n?-1:res;
        }catch (Exception e){
            return -1;
        }
    }

    public void reverse(char[] arr ,int i){
        int left = i+1;
        int right = arr.length-1;
        while (left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }

    public void swap(char[] arr ,int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
