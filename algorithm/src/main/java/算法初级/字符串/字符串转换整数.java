package 算法初级.字符串;

public class 字符串转换整数 {
    public int myAtoi(String s) {
        // 清洗
        s = s.trim();
        // 遍历
        StringBuilder sb = new StringBuilder();
        int flag = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i==0&&s.charAt(i)=='+'){
                continue;
            }else if (i==0&&s.charAt(i)=='-'){
                flag = -1;
                continue;
            }

            if (Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }else {
                break;
            }
        }
        // 转换
        if (sb.length()==0){
            return 0;
        }

        Long res = 0L;
        try {
            res = Long.parseLong(sb.toString())*flag;
        }catch (Exception e){
            if (flag==1){
                return Integer.MAX_VALUE;
            }else {
                return Integer.MIN_VALUE;
            }
        }

        if (res>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if (res<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else {
            return res.intValue();
        }
    }

    public static void main(String[] args) {
        字符串转换整数 test = new 字符串转换整数();
        test.myAtoi("20000000000000000000");
    }
}
