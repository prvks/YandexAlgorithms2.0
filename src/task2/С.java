package task2;

import java.util.Scanner;

public class С {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] wordArr = word.toCharArray();
        int ans = 0;
        for (int i = 0; i < word.length() / 2; i++) {
            if (wordArr[i] != wordArr[word.length() - 1 - i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
