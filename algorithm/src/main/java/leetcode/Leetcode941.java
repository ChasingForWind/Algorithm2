package leetcode;

/**
 * @Classname Leetcode941
 * @Description 找最高的山峰
 * @Date 2021/6/21 9:54 下午
 * @Created by liuchang
 */
public class Leetcode941 {
    public boolean validMountainArray(int[] arr) {
        //代码鲁棒性
        if (arr==null||arr.length<3) return false;
        int front = 0;
        int behind = arr.length-1;
        //前指针
        while (front<arr.length-1){
            if (arr[front]<arr[front+1]){
                front++;
            }else {
                break;
            }
        }
        //后指针
        while (behind>0){
            if (arr[behind]<arr[behind-1]){
                behind--;
            }else {
                break;
            }
        }
//        System.out.println(front);
//        System.out.println(behind);
        //判断两个指针指向的山峰是否相同
        return front==behind&&front!=arr.length-1&&front!=0;
    }

    public static void main(String[] args) {
        Leetcode941 test = new Leetcode941();
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(test.validMountainArray(arr));
    }
}
