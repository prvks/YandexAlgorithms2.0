package task6;

import java.util.Arrays;
import java.util.Scanner;

public class E {

    //!!!Решение не проходит на контесте по TL!!!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = scanner.nextInt();
        }
        Arrays.sort(points);
        int left = 0;
        int right = points[n - 1] - points[0];
        int l;
        int count;
        int maxRight;

        while (left < right) {
            l = (left + right) / 2;
            count = 0;
            maxRight = points[0] - 1;
            for (int point : points) {
                if (point > maxRight)  {
                    count++;
                    maxRight = point + l;
                    if (count > k) {
                        break;
                    }
                }
            }
            if (count <= k) {
                right = l;
            } else {
                left = l + 1;
            }
        }
        System.out.println(left);
    }
}
