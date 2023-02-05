package 模拟;

import java.util.HashSet;

public class 猜数字游戏 {
    public String getHint(String secret, String guess) {
        // 辅助数组
        int a = 0;
        int b = 0;
        char[] ch1 = secret.toCharArray();
        char[] ch2 = guess.toCharArray();
        int[] scount = new int[10];
        int[] gcount = new int[10];

        // 遍历1
        for (int i = 0; i < ch2.length; i++) {
            if (ch2[i] == ch1[i]) {
                a++;
            } else {
                scount[ch1[i]-'0']++;
                gcount[ch2[i]-'0']++;
            }
        }

        // 遍历2
        for (int i = 0; i < 10; i++) {
            b = b + Math.min(scount[i],gcount[i]);
        }

        // 构造返回
        StringBuilder sb = new StringBuilder();
        return sb.append(a).append("A").append(b).append("B").toString();
    }

    public static void main(String[] args) {
        猜数字游戏 test = new 猜数字游戏();
        System.out.println(test.getHint("1123", "0111"));
    }
}
