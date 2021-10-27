package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> coordinatesList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            coordinatesList.add(scanner.nextInt());
        }
        System.out.println(coordinatesList.get(coordinatesList.size() / 2));
    }
}
