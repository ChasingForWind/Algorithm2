package swordoffer;

/**
 * @Classname 表示数值的字符串
 * @Description TODO
 * @Date 2022/7/1 07:43
 * @Created by liuchang
 */
public class 表示数值的字符串 {
    public boolean isNumber(String s) {
        if (s==null||s.length()==0) {
            return false;
        }
        boolean numFlag = false;
        boolean dotFlag = false;
        boolean eFlag = false;

        s = s.trim();

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='0'&&ch[i]<='9'){
                numFlag = true;
                // 之前没出现过 小数点 且 没出现过e
            }else if (ch[i] == '.' && !eFlag && !dotFlag){
                dotFlag = true;
                // 之前出现过 数字 且 没出现过e
            }else if ((ch[i]=='e'||ch[i]=='E')&&numFlag&!eFlag){
                eFlag = true;
                // 保障后面会出现数字
                numFlag = false;
                // 正负号的情况
            }else if ((ch[i]=='+'||ch[i]=='-')&&(i==0||ch[i-1]=='e'||ch[i-1]=='E')){

            }else {
                return false;
            }
        }
        return numFlag;
    }
}
