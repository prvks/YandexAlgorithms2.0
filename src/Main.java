import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(rle("AAAAAKBBBBBBBBBBBBBBAAAAAAAAAAAAAAAAAAAAAAAAAAABBBWWK"));
        int[] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumberFromDigits(digits));
        Set<Integer> set = new HashSet<>();
    }

    private static String rle(String input) {
        char[] inputArr = input.toCharArray();
        char lastSym = inputArr[0];
        int lastPos = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < inputArr.length; i++) {
            if (inputArr[i] != lastSym) {
                stringBuilder.append(pack(lastSym, i - lastPos));
                lastSym = inputArr[i];
                lastPos = i;
            }
        }
        stringBuilder.append(pack(lastSym, inputArr.length - lastPos));
        return stringBuilder.toString();
    }

    private static String pack(char c, int count) {
        if (count > 1) {
            return String.valueOf(c) + count;
        }
        return String.valueOf(c);
    }

    private static String maxNumberFromDigits(int[] digits) {
        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
//        Arrays.sort(digits);
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = digits.length - 1; i >= 0; i--) {
//            stringBuilder.append(digits[i]);
//        }
//        return stringBuilder.toString();
    }

}