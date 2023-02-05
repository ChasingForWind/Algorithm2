package 滑动窗口与双指针;

public class 可获得的最大点数 {
    public int maxScore(int[] cardPoints, int k) {
        // 整体数组求和
        int sum = 0;
        for (int cardPoint : cardPoints) {
            sum += cardPoint;
        }

        // 滑动窗口求中间最小点数
        int y = cardPoints.length-k;
        int slow = 0;
        int fast = y - 1;
        int temp = 0;
        for (int i = 0; i < y; i++) {
            temp += cardPoints[i];
        }
        int min = temp;
        while (fast <= cardPoints.length - 2) {
            fast++;
            temp = temp + cardPoints[fast]- cardPoints[slow];
            slow++;
            min = Math.min(min,temp);
        }
        // 返回值
        return sum-min;
    }

    public static void main(String[] args) {
        可获得的最大点数 test = new 可获得的最大点数();
        int[] arr = {9,7,7,9,7,7,9};
        System.out.println(test.maxScore(arr, 7));
    }
}
