package task2;

import java.util.Arrays;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int folderCount = scanner.nextInt();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < folderCount; i++) {
            int current = scanner.nextInt();
            sum += current;
            if (current > max) {
                max = current;
            }
        }
        System.out.println(sum - max);
    }
}
