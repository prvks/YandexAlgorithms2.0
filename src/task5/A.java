package task5;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = scanner.nextInt();
        int[] arr = new int[size];
        long[] prefixsum = new long[size + 1];
        Arrays.fill(prefixsum, 0);
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            prefixsum[i + 1] = prefixsum[i] + arr[i];
        }
        int l;
        int r;
        for (int i = 0; i < count; i++) {
            l = scanner.nextInt();
            r = scanner.nextInt();
            if (l == r) {
                System.out.println(arr[l - 1]);
            } else {
                System.out.println(prefixsum[r] - prefixsum[l - 1]);
            }
        }
    }
}
