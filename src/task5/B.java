package task5;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        long[] prefix = new long[size + 1];
        Arrays.fill(prefix, 0);
        int minPrefSumI = 0;
        long maxSum = arr[0];
        long curSum;
        for (int i = 1; i < size + 1; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
            if (prefix[i - 1] < prefix[minPrefSumI]) {
                minPrefSumI = i - 1;
            }
            curSum = prefix[i] - prefix[minPrefSumI];
            if (maxSum < curSum) {
                maxSum = curSum;
            }
        }
        System.out.println(maxSum);
    }
}
