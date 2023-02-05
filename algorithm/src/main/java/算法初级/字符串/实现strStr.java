package 算法初级.字符串;

public class 实现strStr {
    public int strStr(String haystack, String needle) {
        if (needle==null||needle.length()==0){
            return -1;
        }
        if (haystack.length()<needle.length()){
            return -1;
        }
        int index = 0;
        while (index<=haystack.length()-1){
            if (haystack.charAt(index)==needle.charAt(0)){
                int i = index;
                int j = 0;
                while (j<=needle.length()-1&&i<=haystack.length()-1){
                    if (haystack.charAt(i)==needle.charAt(j)){
                        i++;
                        j++;
                    }else {
                        break;
                    }
                }
                if(j==needle.length()){
                    return index;
                }
            }
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        实现strStr test = new 实现strStr();
        test.strStr("mississippi","issip");
    }
}
