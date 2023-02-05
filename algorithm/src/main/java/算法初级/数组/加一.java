package 算法初级.数组;

public class 加一 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            digits[i]++;
            if (digits[i]/10==1) {
                digits[i] = 0;
            }else {
                return digits;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        for (int i = 1; i < newDigits.length; i++) {
            newDigits[i] = 0;
        }
        return newDigits;
    }
}
