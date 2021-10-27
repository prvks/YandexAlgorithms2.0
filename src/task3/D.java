package task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int[] arr = new int[max + 1];
        Arrays.fill(arr, 0);
        scanner.nextLine();
        List<Integer> digits;
        String nextLine = scanner.nextLine();
        String result;
        while (!nextLine.equals("HELP")) {
            digits = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
            result = scanner.nextLine();
            if (result.equals("YES")) {
                for (int i : digits) {
                    arr[i]++;
                }
            } else {
                for (int i : digits) {
                    arr[i]--;
                }
            }
            nextLine = scanner.nextLine();
        }
        boolean isFirst = true;
        int maxCounter = Collections.max(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == maxCounter) {
                if (isFirst) {
                    System.out.print(i);
                    isFirst = false;
                } else {
                    System.out.print(" " + i);
                }
            }
        }
    }
}
