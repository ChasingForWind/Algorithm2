package 算法初级.字符串;

public class 最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null||strs.length==0){
            return "";
        }

        String ans = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String temp = strs[i];
            int j = 0;
            while (j<temp.length()&&j<ans.length()&&ans.charAt(j)==temp.charAt(j)){
                j++;
            }
            ans = ans.substring(0,j);
            if (ans.equals("")){
                return "";
            }
        }
        return ans;
    }
}
