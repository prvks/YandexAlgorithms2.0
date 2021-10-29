package task6;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long k = scanner.nextLong();
        int b = scanner.nextInt();
        long m = scanner.nextLong();
        long x = scanner.nextLong();
        long l = 0;
        long r = x * 2 / Math.max(a, b) + 1;
        while (l < r) {
            long days = (l + r) / 2;
            long ha = days / k;
            long hb = days / m;
            long trunks = (days - ha) * a + (days - hb) * b;
            if (trunks >= x) {
                r = days;
            } else {
                l = days + 1;
            }
        }
        System.out.println(l);
    }
}
