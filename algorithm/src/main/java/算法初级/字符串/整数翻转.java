package 算法初级.字符串;

import java.util.Arrays;

public class 整数翻转 {
    public int reverse(int x) {
        int symbol;
        if (x>=0){
            symbol = 1;
        }else {
            symbol = -1;
        }
        x = Math.abs(x);

        char[] ch = String.valueOf(x).toCharArray();
        int length = ch.length-1;
        for (int i = 0; i <= (ch.length-1)/2 ; i++) {
            swap(ch,i,length-i);
        }

        try {
            int res = Integer.parseInt(String.valueOf(ch));
            return res*symbol;
        } catch (NumberFormatException e) {
            return 0;
        }


    }

    public void swap(char[] arr ,int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        整数翻转 test = new 整数翻转();
        System.out.println(test.reverse(-123));

    }
}
