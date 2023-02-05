package 算法初级.字符串;

public class 外观数列 {
    public String countAndSay(int n) {
        if (n == 1){
            return "1";
        }

        return help("1",2,n);
    }

    public String help(String s , int i, int n){
        if (i>n){
            return s;
        }

        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        int index = 0;
        while (index<=ch.length-1){
            char temp = ch[index];
            int num = 1;
            while (index+1<=ch.length-1&&ch[index+1]==temp){
                num++;
                index++;
            }
            sb.append(num).append(temp);
            index++;
        }
        return help(sb.toString(),i+1,n);
    }

    public static void main(String[] args) {
        外观数列 test = new 外观数列();
        System.out.println(test.countAndSay(4));
    }

}
