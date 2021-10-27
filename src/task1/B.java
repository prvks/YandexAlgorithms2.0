package task1;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int numberFirstStation = scanner.nextInt();
        int numberSecondStation = scanner.nextInt();
        System.out.println(Math.min(Math.abs(numberSecondStation - numberFirstStation - 1),
                count - (2 + Math.abs(numberSecondStation - numberFirstStation - 1))));
    }
}
