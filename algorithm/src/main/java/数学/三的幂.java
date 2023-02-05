package 数学;

public class 三的幂 {
    public boolean isPowerOfThree(int n) {
        if (n<=0){
            return false;
        }

        if (n==1){
            return true;
        }

        while (n%3==0){
            n = n/3;
            if (n==1){
                return true;
            }
        }

        return false;
    }
}
