package task6;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(findFirst(new CheckGreater(), arr, 0, arr.length - 1, x2) -
                    findFirst(new CheckGreaterOrEquals(), arr, 0, arr.length - 1, x1));
        }
    }

    private static int findFirst(Check check, int[] arr, int l, int r, int x) {
        int m;
        while (l < r) {
            m = (l + r) / 2;
            if (check(check, m, arr, x)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        if (!check(check, l, arr, x)) {
            return arr.length;
        }
        return l;
    }

    private static boolean check(Check check, int index, int[] arr, int x) {
        return check.check(index, arr, x);
    }
}

interface Check {
    boolean check(int index, int[] arr, int x);
}

class CheckGreaterOrEquals implements Check {
    @Override
    public boolean check(int index, int[] arr, int x1) {
        return arr[index] >= x1;
    }
}

class CheckGreater implements Check {
    @Override
    public boolean check(int index, int[] arr, int x2) {
        return arr[index] > x2;
    }
}
