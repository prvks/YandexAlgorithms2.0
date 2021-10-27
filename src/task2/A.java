package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.NavigableMap;
import java.util.TreeMap;

public class A {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("A:\\Рабочий стол\\JavaChallenges\\YandexAlgs\\src\\Task2\\inputTask2A.txt"))) {
            int input;
            NavigableMap<Integer, Integer> treeMap = new TreeMap<>();
            while ((input = Integer.parseInt(in.readLine())) != 0) {
                treeMap.put(input, treeMap.getOrDefault(input, 0) + 1);
            }
            System.out.println(treeMap.lastEntry().getValue());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
