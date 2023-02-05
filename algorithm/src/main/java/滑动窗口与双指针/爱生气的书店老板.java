package 滑动窗口与双指针;

public class 爱生气的书店老板 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int origin = 0;
        // 小于3分钟
        if(customers.length<=minutes){
            for (int i = 0; i < customers.length; i++) {
                origin += customers[i];
            }
            return origin;
        }

        // 原本就满意

        for (int i = 0; i < customers.length; i++) {
            origin += customers[i]*(grumpy[i]^1);
        }


        // 滑动窗口算出窗口内部不满意
        int fast = minutes-1;
        int slow = 0;
        int max = 0;
        while (fast<=customers.length-1){
            int temp = 0;
            for (int j = slow; j <= fast; j++) {
                temp += customers[j]*(grumpy[j]);
            }
            max = Math.max(temp,max);
            fast++;
            slow++;
        }
        return max+origin;
    }

    public static void main(String[] args) {
        爱生气的书店老板 test = new 爱生气的书店老板();
        int[] arr1 = {1,0,1,2,1,1,7,5};
        int[] arr2 = {0,1,0,1,0,1,0,1};
        System.out.println(test.maxSatisfied(arr1, arr2, 3));
    }
}
