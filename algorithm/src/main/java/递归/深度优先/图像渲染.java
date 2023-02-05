package 递归.深度优先;

public class 图像渲染 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] flag = new boolean[image.length][image[0].length];
        draw(image,sr,sc,color,flag,image[sr][sc]);
        return image;
    }

    private void draw(int[][] image, int sr, int sc, int color,boolean[][] flag,int orginalColor) {
        if (sr<0||sc<0||sr>image.length-1||sc>image[0].length-1|| flag[sr][sc]||image[sr][sc]!=orginalColor){
            return;
        }else {
            flag[sr][sc] = true;
            image[sr][sc] = color;
            draw(image,sr+1,sc,color,flag,orginalColor);
            draw(image,sr-1,sc,color,flag,orginalColor);
            draw(image,sr,sc-1,color,flag,orginalColor);
            draw(image,sr,sc+1,color,flag,orginalColor);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{1,0,0}};
        图像渲染 test = new 图像渲染();
        test.floodFill(arr,1,0,2);

    }
}
