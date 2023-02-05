package 数学;

public class 位1的个数 {
    public int hammingWeight(int n) {
        int res = 0;

        if (n<0){
            res++;
        }

        int helper = 1;
        for (int i = 0; i < 31; i++) {
            int temp = n & helper;
            if (temp>0){
                res++;
            }
            helper = helper<<1;
        }
        return res;
    }
}
