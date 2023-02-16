package leetcode.热题100;

public class 热题07盛水最多的容器 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int res = 0;

        while (l<r){
            int temp = height[l]<height[r]?(r-l)*height[l++]:(r-l)*height[r--];
            res = Math.max(res,temp);
        }

        return res;
    }
}
