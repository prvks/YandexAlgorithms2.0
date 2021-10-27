package task2;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        double middle = length / (double) 2;
        int count = scanner.nextInt();
        int[] blocks = new int[count];
        for (int i = 0; i < blocks.length; i++) {
            blocks[i] = scanner.nextInt();
            if (blocks[i] < middle && blocks[i] + 1 > middle) {
                System.out.println(blocks[i]);
                return;
            }
            if (blocks[i] >= middle) {
                System.out.println(blocks[i - 1] + " " + blocks[i]);
                return;
            }
        }
    }
}
