package 数学;

import java.util.Arrays;

public class 计数质数 {
    public int countPrimes(int n) {
        if (n==0){
            return 0;
        }

        // 1、筛选
        Boolean[] ifPrime = new Boolean[n];
        Arrays.fill(ifPrime,true);

        for (int i = 2; i*i < n; i++) {
            if (ifPrime[i]){
                for (int j = i*i; j < n ; j=i+j) {
                    ifPrime[j] = false;
                }
            }
        }

        // 2、计数
        int count = 0;
        for (Boolean aBoolean : ifPrime) {
            if (aBoolean) {
                count++;
            }
        }
        return count-2;
    }

    public static void main(String[] args) {
        计数质数 test = new 计数质数();
        System.out.println(test.countPrimes(3));
    }
}
