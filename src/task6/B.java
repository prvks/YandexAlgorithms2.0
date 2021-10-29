package task6;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        int numbersLength = scanner.nextInt();
        int[] numbers = new int[numbersLength];
        for (int i = 0; i < numbersLength; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {
            System.out.println(findFirst(arr, 0, arr.length - 1, number) + " "
                    + findLast(arr, 0, arr.length - 1, number));
        }
    }

    private static int findFirst(int[] arr, int l, int r, int x) {
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        if (arr[l] != x) {
            return 0;
        }
        return l + 1;
    }

    private static int findLast(int[] arr, int l, int r, int x) {
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr[m] <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        if (arr[l] != x) {
            return 0;
        }
        return l + 1;
    }
}
