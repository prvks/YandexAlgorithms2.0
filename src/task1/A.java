package task1;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte code = scanner.nextByte();
        byte interaktor = scanner.nextByte();
        byte checker = scanner.nextByte();
        switch (interaktor) {
            case 0:

                if (code != 0) {
                    System.out.println(3);
                } else {
                    System.out.println(checker);
                }
                break;
            case 1:
                System.out.println(checker);
                break;
            case 4:
                if (code != 0) {
                    System.out.println(3);
                } else {
                    System.out.println(4);
                }
                break;
            case 6:
                System.out.println(0);
                break;
            case 7:
                System.out.println(1);
                break;
            default:
                System.out.println(interaktor);
        }
    }
}
