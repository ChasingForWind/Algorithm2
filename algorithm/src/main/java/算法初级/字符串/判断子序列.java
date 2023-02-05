package 算法初级.字符串;

public class 判断子序列 {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        if (s.length()==0){
            return true;
        }
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int index1 = 0;
        int index2 = 0;
        while (index2!=ch2.length){
            if (index1==ch1.length){
                return true;
            }
            if (ch1[index1]==ch2[index2]){
                index1++;
            }
            index2++;
        }
        return index1==ch1.length;
    }

    // s = "abc", t = "ahbgdc"
    // s = "axc", t = "ahbgdc"
    public static void main(String[] args) {
        判断子序列 test = new 判断子序列();
        System.out.println(test.isSubsequence("abc", "ahbgdc"));
        System.out.println(test.isSubsequence("axc", "ahbgdc"));

    }
}
