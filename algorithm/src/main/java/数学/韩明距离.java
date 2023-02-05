package 数学;

public class 韩明距离 {
    public int hammingDistance(int x, int y) {
        int temp = x^y;
        int count = 0;
        while (temp!=0){
            if ((temp&1)==1) {
                count++;
            }
            temp=temp>>1;
        }
        return count;
    }
}
