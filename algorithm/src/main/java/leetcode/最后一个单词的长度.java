package leetcode;

public class 最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        String trim = s.trim();
        String[] split = trim.split(" ");
        return split[split.length-1].length();
    }

    public static void main(String[] args) {
        最后一个单词的长度 test = new 最后一个单词的长度();
        System.out.println(test.lengthOfLastWord("Hello World"));
        System.out.println(test.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(test.lengthOfLastWord("luffy is still joyboy"));
    }
}
