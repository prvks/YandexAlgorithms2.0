package task4;

import java.util.*;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> map = new LinkedHashMap<>();
        int messages = scanner.nextInt();
        int messagesCount = 1;
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            int messageNumber = scanner.nextInt();
            scanner.nextLine();
            if (messageNumber == 0) {
                String theme = scanner.nextLine();
                List<Integer> list = new ArrayList<>();
                list.add(messagesCount);
                map.put(theme, list);
            } else {
                int finalMessagesCount = messagesCount;
                map.entrySet().stream().filter(e -> e.getValue().contains(messageNumber))
                        .forEach(e -> e.getValue().add(finalMessagesCount));
            }
            scanner.nextLine();
            messagesCount++;
        }
        int maxLength = 0;
        String popularTheme = "";
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() > maxLength) {
                maxLength = entry.getValue().size();
                popularTheme = entry.getKey();
            }
        }
        System.out.println(popularTheme);
    }
}
