package task6;

import java.util.Scanner;

public class C {

    private static final double EPSILON = 0.0000001;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(dBinSearch(-100000, 100000, a, b, c, d));
    }

    private static double dBinSearch(double l, double r, int a, int b, int c, int d) {
        if (a < 0) {
            while (l + C.EPSILON < r) {
                double m = (l + r) / 2;
                if (res(a, b, c, d, m) < 0) {
                    r = m;
                } else {
                    l = m;
                }
            }
        } else {
            while (l + C.EPSILON < r) {
                double m = (l + r) / 2;
                if (res(a, b, c, d, m) > 0) {
                    r = m;
                } else {
                    l = m;
                }
            }
        }
        return l;
    }

    private static double res(int a, int b, int c, int d, double x) {
        return a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d;
    }
}
